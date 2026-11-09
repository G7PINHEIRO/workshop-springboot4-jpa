package com.MateusPinheiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MateusPinheiro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
