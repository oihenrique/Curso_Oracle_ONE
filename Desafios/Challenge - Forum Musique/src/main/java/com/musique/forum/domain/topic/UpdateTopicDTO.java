package com.musique.forum.domain.topic;

public record UpdateTopicDTO(Long id, String title, String message, TopicStatus status) {
    public UpdateTopicDTO(Topic topic) {
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getStatus());
    }
}
