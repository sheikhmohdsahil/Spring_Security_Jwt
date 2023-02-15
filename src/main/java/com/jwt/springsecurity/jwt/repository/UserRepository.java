package com.jwt.springsecurity.jwt.repository;



import com.jwt.springsecurity.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}