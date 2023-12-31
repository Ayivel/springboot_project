package com.NEWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NEWS.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}