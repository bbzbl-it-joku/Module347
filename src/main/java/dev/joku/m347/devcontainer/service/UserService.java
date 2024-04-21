package dev.joku.m347.devcontainer.service;

import dev.joku.m347.devcontainer.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import dev.joku.m347.devcontainer.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // Get all Users
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    // Create a new user
    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    // Read user by ID
    public Optional<Users> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Update user information
    public Users updateUser(Users user) {
        if (user.getId() == 0 || userRepository.existsById(user.getId())) {
            throw new EntityNotFoundException("User does not exist");
        }
        return userRepository.save(user);
    }

    // Delete a user by ID
    public void deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            throw new EntityNotFoundException("User does not exist");
        }
        userRepository.deleteById(id);
    }
}
