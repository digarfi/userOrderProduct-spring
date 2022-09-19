package com.digarfi.orderProduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digarfi.orderProduct.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
