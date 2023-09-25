package com.musique.forum.repositories;

import com.musique.forum.domain.user.User;
import com.musique.forum.domain.user.UserListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    Page<UserListDTO> findAllByActiveTrue(Pageable paginate);

    UserDetails findByLogin(String login);
}
