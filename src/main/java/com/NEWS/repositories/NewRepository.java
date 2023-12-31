
package com.NEWS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NEWS.Entities.New;

public interface NewRepository extends JpaRepository<New, Long> {

}