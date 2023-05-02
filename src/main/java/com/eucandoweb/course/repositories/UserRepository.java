package com.eucandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eucandoweb.course.entities.User;


public interface UserRepository extends JpaRepository<User,Long> {

}
