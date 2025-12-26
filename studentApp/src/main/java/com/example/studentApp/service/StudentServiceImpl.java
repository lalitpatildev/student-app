package com.example.studentApp.service;

import com.example.studentApp.entity.Student;
import com.example.studentApp.exception.StudentAlreadyExistsException;
import com.example.studentApp.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
public final StudentRepository studentRepository;

   StudentServiceImpl(StudentRepository studentRepository){
       this.studentRepository = studentRepository;
   }

    @Override
    public Student saveStudent(Student student) {
       if(studentRepository.findByEmail(student.getEmail()).isPresent())
       {
           throw new StudentAlreadyExistsException("This Email alreay register: "+student.getEmail());
       }
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
