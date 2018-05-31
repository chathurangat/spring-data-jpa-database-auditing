package com.springbootdev.examples.jpa.auditing.repository;

import com.springbootdev.examples.jpa.auditing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
