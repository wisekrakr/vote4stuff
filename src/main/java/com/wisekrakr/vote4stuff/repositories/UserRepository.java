package com.wisekrakr.vote4stuff.repositories;

import com.wisekrakr.vote4stuff.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String s);
}
