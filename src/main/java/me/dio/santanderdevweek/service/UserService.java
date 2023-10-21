package me.dio.santanderdevweek.service;

import me.dio.santanderdevweek.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
