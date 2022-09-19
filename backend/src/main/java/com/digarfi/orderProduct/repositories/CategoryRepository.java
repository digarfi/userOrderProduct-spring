package com.digarfi.orderProduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digarfi.orderProduct.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
