package dev.joku.m347.devcontainer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joku.m347.devcontainer.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    public Optional<Users> findByUserName(String userName);
}
