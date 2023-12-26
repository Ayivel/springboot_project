package com.prueba.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prueba.demo.Entities.Student;
import com.prueba.demo.Entities.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    @ResponseBody
    public List<Student> getStudentService() {
        return studentService.getStudent();
    }

}
