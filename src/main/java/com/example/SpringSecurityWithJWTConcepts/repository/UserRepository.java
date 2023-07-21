package com.example.SpringSecurityWithJWTConcepts.repository;

import java.util.Optional;

import com.example.SpringSecurityWithJWTConcepts.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
