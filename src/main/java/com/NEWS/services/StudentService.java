
package com.NEWS.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.NEWS.news.Entities.Student;

/**
 * StudentService
 */
@Service
public class StudentService {
    public Student newStudent() {
        return new Student("Ariel", 20, "vhe@gmail.com");
    }

    public List<Student> getStudent() {
        return List.of(newStudent());
    }

}