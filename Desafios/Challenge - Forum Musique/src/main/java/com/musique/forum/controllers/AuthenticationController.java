package com.musique.forum.controllers;

import com.musique.forum.domain.user.AuthenticationDTO;
import com.musique.forum.domain.user.LoginResponseDTO;
import com.musique.forum.domain.user.User;
import com.musique.forum.services.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    @Transactional
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO dados) {
        System.out.println("tolete");
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.password());
        System.out.println("banana");
        var authentication = authenticationManager.authenticate(authenticationToken);
        System.out.println("coco");
        var tokenJWT = tokenService.generateToken((User) authentication.getPrincipal());
        System.out.println(tokenJWT);
        return ResponseEntity.ok(new LoginResponseDTO(tokenJWT));
    }
}