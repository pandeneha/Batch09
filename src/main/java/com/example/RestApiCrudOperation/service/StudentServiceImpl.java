package com.example.RestApiCrudOperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApiCrudOperation.Repository.StudentRepository;
import com.example.RestApiCrudOperation.model.Student;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student stu) {
		Student student = studentRepository.save(stu);
		
		
		if(student !=null) {
			return true;
		}else {
		return false;
	}
}
	}
