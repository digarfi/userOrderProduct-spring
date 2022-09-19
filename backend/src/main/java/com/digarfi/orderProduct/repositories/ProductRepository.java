package com.digarfi.orderProduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digarfi.orderProduct.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
