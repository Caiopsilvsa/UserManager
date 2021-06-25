package com.projeto.UserManager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.projeto.UserManager.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	

	

}
