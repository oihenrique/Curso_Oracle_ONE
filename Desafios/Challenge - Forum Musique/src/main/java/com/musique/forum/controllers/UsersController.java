package com.musique.forum.controllers;

import com.musique.forum.domain.user.UpdateUserDTO;
import com.musique.forum.domain.user.User;
import com.musique.forum.domain.user.UserDTO;
import com.musique.forum.domain.user.UserListDTO;
import com.musique.forum.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("user")
public class UsersController {

    @Autowired
    UserRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity create(@RequestBody @Valid UserDTO userDTO, UriComponentsBuilder uriBuilder) {

        User user = new User(userDTO);
        repository.save(user);

        var uri = uriBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(new UserListDTO(user));
    }

    @GetMapping
    public ResponseEntity<Page<UserListDTO>> list(@PageableDefault(sort = "name") Pageable paginate) {
        Page<UserListDTO> userList = repository.findAllByActiveTrue(paginate);

        return ResponseEntity.ok(userList);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid UpdateUserDTO updateUserDTO) {
        User user = repository.getReferenceById(updateUserDTO.id());
        user.updateRegistry(updateUserDTO);

        return ResponseEntity.ok(new UserListDTO(user));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deactivate(@PathVariable Long id) {
        User user = repository.getReferenceById(id);
        user.deactivate();

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity detail(@PathVariable Long id) {
        User user = repository.getReferenceById(id);
        return ResponseEntity.ok(new UserListDTO(user));
    }
}
