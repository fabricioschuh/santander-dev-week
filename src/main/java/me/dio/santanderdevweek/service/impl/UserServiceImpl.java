package me.dio.santanderdevweek.service.impl;

import lombok.AllArgsConstructor;
import me.dio.santanderdevweek.domain.model.User;
import me.dio.santanderdevweek.domain.repository.UserRepository;
import me.dio.santanderdevweek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("The user ID already exists.");
        }

        return userRepository.save(userToCreate);
    }
}
