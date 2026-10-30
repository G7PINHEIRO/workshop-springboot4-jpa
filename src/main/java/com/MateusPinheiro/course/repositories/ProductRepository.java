package com.MateusPinheiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MateusPinheiro.course.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {
	
}
