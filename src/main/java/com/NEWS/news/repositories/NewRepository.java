
package com.NEWS.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NEWS.news.Entities.New;

public interface NewRepository extends JpaRepository<New, Long> {

}