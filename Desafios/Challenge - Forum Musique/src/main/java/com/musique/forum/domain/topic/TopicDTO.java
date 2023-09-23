package com.musique.forum.domain.topic;

import com.musique.forum.domain.user.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicDTO(
        @NotBlank
        String title,
        @NotBlank
        String message) {
}
