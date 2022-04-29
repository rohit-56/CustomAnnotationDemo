package com.Task4.CustomAnnotationsExample.repository;

import com.Task4.CustomAnnotationsExample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

  public Student findById(int id);
}
