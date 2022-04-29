package com.Task4.CustomAnnotationsExample.controller;

import com.Task4.CustomAnnotationsExample.model.Student;
import com.Task4.CustomAnnotationsExample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class Controllers {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id){
      return new ResponseEntity(studentService.findStudent(id), HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<Student> addStudentDetails(@Valid @RequestBody Student student){
       return new ResponseEntity<>(studentService.addStudent(student),HttpStatus.ACCEPTED);
    }

}
