package me.dio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.model.User;

public interface UserRepository extends JpaRepository<User ,Long>{

    boolean existsByAccountNumber(String number);

}
