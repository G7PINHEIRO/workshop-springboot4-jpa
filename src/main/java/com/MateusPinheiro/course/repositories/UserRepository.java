package com.MateusPinheiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MateusPinheiro.course.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
	
}
