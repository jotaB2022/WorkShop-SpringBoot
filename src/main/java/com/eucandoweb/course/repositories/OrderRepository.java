package com.eucandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eucandoweb.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order,Long> {

}
