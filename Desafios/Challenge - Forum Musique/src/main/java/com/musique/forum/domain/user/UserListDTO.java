package com.musique.forum.domain.user;

public record UserListDTO(Long id, String name, String login) {
    public UserListDTO(User user) {
        this(user.getId(), user.getName(), user.getLogin());
    }
}
