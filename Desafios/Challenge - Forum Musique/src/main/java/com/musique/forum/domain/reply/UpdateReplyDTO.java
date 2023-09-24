package com.musique.forum.domain.reply;

public record UpdateReplyDTO(Long id, String message) {
    public UpdateReplyDTO(Reply reply) {
        this(reply.getId(), reply.getMessage());
    }
}
