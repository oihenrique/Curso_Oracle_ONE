package com.musique.forum.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AuthenticationDTO(@NotBlank @Email String login, @NotBlank String password) {
}
