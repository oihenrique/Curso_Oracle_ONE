package com.musique.forum.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean active;

    public User(UserDTO userDTO) {
        this.name = userDTO.name();
        this.email = userDTO.email();
        this.password = userDTO.password();
    }

    public void updateRegistry(UpdateUserDTO update) {
        if (update.name() != null) {
            this.name = update.name();
        }
        if (update.email() != null) {
            this.email = update.email();
        }
        if (update.password() != null) {
            this.password = update.password();
        }
    }

    public void deactivate() {
        this.active = false;
    }
}
