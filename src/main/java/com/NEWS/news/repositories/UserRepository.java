package com.NEWS.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.NEWS.news.Entities.UserApp;

public interface UserRepository extends JpaRepository<UserApp, Long> {

    @Query("SELECT u FROM User u WHERE u.email = :email")
    public UserApp searchByEmail(@Param("email") String email);
}