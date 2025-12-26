package com.example.studentApp.service;

import com.example.studentApp.entity.Student;

import java.util.*;

public interface StudentService {
Student saveStudent(Student student);
List<Student> getAllStudent();
}
