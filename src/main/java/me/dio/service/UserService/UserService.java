package me.dio.service.UserService;

import jakarta.persistence.Entity;
import me.dio.model.User;

@Entity
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}