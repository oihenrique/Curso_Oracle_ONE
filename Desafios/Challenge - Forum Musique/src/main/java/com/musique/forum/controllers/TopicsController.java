package com.musique.forum.controllers;

import com.musique.forum.domain.reply.Reply;
import com.musique.forum.domain.topic.Topic;
import com.musique.forum.domain.topic.TopicDTO;
import com.musique.forum.domain.topic.TopicListDTO;
import com.musique.forum.domain.topic.UpdateTopicDTO;
import com.musique.forum.domain.user.User;
import com.musique.forum.domain.user.UserListDTO;
import com.musique.forum.repositories.TopicRepository;
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
@RequestMapping("topic")
public class TopicsController {

    @Autowired
    TopicRepository repository;
    @Autowired
    UserRepository userRepository;

    @PostMapping
    @Transactional
    public ResponseEntity post(@RequestBody @Valid TopicDTO topicDTO, UriComponentsBuilder uriBuilder) {

        Topic topic = new Topic(topicDTO, userRepository.getReferenceById(1L));
        repository.save(topic);

        var uri = uriBuilder.path("/{id}")
                .buildAndExpand(topic.getId()).toUri();

        return ResponseEntity.created(uri).body(new TopicListDTO(topic));
    }

    @GetMapping
    public ResponseEntity<Page<TopicListDTO>> list(@PageableDefault(sort = "creationDate") Pageable paginate) {

        Page<TopicListDTO> topicList = repository.findAll(paginate).map(TopicListDTO::new);

        return ResponseEntity.ok(topicList);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid UpdateTopicDTO updateTopicDTO) {
        Topic topic = repository.getReferenceById(updateTopicDTO.id());
        topic.updatePost(updateTopicDTO);

        return ResponseEntity.ok(new TopicListDTO(topic));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id) {
        Topic topic = repository.getReferenceById(id);
        repository.delete(topic);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity detail(@PathVariable Long id) {
        Topic topic = repository.getReferenceById(id);
        return ResponseEntity.ok(new TopicListDTO(topic));
    }
}
