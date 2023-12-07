package com.example.onetomanyspring.repository;

import com.example.onetomanyspring.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);

    Optional<User> findUserByUserId(Long userId);
}
