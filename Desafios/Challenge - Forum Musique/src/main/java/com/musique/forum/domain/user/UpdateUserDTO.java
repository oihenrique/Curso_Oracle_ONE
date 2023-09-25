package com.musique.forum.domain.user;

public record UpdateUserDTO(Long id, String name, String login, String password) {
    public UpdateUserDTO(User user) {
        this(user.getId(), user.getName(), user.getLogin(), user.getPassword());
    }
}
