package com.musique.forum.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(
        @NotBlank String name,
        @NotBlank @Email String login,
        @NotBlank String password,
        @NotNull UserRoles role) {
}
