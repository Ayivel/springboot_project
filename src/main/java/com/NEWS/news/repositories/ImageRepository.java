
package com.NEWS.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NEWS.news.Entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}