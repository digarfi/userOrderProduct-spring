package com.digarfi.orderProduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digarfi.orderProduct.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
