package com.example.studentApp.controller;

import com.example.studentApp.entity.Student;
import com.example.studentApp.service.StudentService;
import com.example.studentApp.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController()
@RequestMapping("/students")

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //save student records first
    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    //get all student list
    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }


}
