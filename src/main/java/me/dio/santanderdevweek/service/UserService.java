package me.dio.santanderdevweek.service;

import me.dio.santanderdevweek.domain.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

    List<User> findAll();

}
