package com.musique.forum.domain.reply;

import com.musique.forum.domain.topic.Topic;
import com.musique.forum.domain.user.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record ReplyDTO(
        @NotBlank
        String message) {
}
