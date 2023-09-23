package com.musique.forum.domain.topic;

import com.musique.forum.domain.user.UserListDTO;

import java.time.LocalDateTime;

public record TopicListDTO(Long id, String title, String message, LocalDateTime creationDate, TopicStatus status, UserListDTO author) {

    public TopicListDTO(Topic topic) {
        this(topic.getId(),
                topic.getTitle(),
                topic.getMessage(),
                topic.getCreationDate(),
                topic.getStatus(),
                new UserListDTO(topic.getAuthor()));
    }
}
