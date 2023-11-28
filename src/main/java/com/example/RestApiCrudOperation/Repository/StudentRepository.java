package com.example.RestApiCrudOperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApiCrudOperation.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
