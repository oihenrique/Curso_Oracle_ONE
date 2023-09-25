package com.musique.forum.domain.topic;

import jakarta.validation.constraints.NotBlank;

public record TopicDTO(
        @NotBlank
        String title,
        @NotBlank
        String message) {
}
