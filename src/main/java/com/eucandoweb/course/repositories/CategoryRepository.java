package com.eucandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eucandoweb.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category,Long> {

}
