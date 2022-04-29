package com.Task4.CustomAnnotationsExample.service;

import com.Task4.CustomAnnotationsExample.model.Student;
import com.Task4.CustomAnnotationsExample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student findStudent(int id){
        return studentRepository.findById(id);
    }
    public Student addStudent(Student student){
       return studentRepository.save(student);
    }

}
