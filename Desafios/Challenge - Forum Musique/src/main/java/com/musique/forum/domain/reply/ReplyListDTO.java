package com.musique.forum.domain.reply;

import com.musique.forum.domain.topic.Topic;
import com.musique.forum.domain.topic.TopicListDTO;
import com.musique.forum.domain.user.User;
import com.musique.forum.domain.user.UserListDTO;

import java.time.LocalDateTime;

public record ReplyListDTO(
        Long id,
        String message,
        LocalDateTime dateTime,
        TopicListDTO topic
) {
    public ReplyListDTO(Reply reply) {
        this(reply.getId(), reply.getMessage(), reply.getCreationDate(), new TopicListDTO(reply.getTopic()));
    }
}
