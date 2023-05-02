package com.eucandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eucandoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
