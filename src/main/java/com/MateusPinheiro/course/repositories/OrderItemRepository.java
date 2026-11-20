package com.MateusPinheiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MateusPinheiro.course.entities.OrderItem;
import com.MateusPinheiro.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
