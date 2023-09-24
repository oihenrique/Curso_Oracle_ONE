package com.musique.forum.controllers;

import com.musique.forum.domain.reply.Reply;
import com.musique.forum.domain.reply.ReplyDTO;
import com.musique.forum.domain.reply.ReplyListDTO;
import com.musique.forum.domain.reply.UpdateReplyDTO;
import com.musique.forum.repositories.ReplyRepository;
import jakarta.validation.Valid;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("reply")
public class RepliesController {

    @Autowired
    ReplyRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity create(@RequestBody @Valid ReplyDTO replyDTO, UriComponentsBuilder uriBuilder) {
        Reply reply = new Reply(replyDTO);
        repository.save(reply);

        var uri = uriBuilder.path("/reply/{id}").buildAndExpand(reply.getId()).toUri();
        return ResponseEntity.created(uri).body(replyDTO);
    }

    @GetMapping
    public ResponseEntity<Page<ReplyListDTO>> list(@PageableDefault(sort = "creationDate") Pageable paginate) {

        Page<ReplyListDTO> replyList = repository.findAll(paginate).map(ReplyListDTO::new);

        return ResponseEntity.ok(replyList);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid UpdateReplyDTO updateReplyDTO) {
        Reply reply = repository.getReferenceById(updateReplyDTO.id());
        reply.updateReply(updateReplyDTO);

        return ResponseEntity.ok(new ReplyListDTO(reply));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id) {
        Reply reply = repository.getReferenceById(id);
        repository.delete(reply);

        return ResponseEntity.noContent().build();
    }
}
