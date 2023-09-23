package com.musique.forum.domain.user;

public record UpdateUserDTO(Long id, String name, String email, String password) {
    public UpdateUserDTO(User user) {
        this(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }
}
