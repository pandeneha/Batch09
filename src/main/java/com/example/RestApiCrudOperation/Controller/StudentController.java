package com.example.RestApiCrudOperation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiCrudOperation.model.Student;
import com.example.RestApiCrudOperation.service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI; 


 @PostMapping(value="/saveStudent",consumes = "application/json")
	public ResponseEntity<String> saveStudent(Student stu){
		boolean saveStudent = studentServiceI.saveStudent(stu);
		
		if(saveStudent) {
			return new ResponseEntity<String>("Student Save Successfully", HttpStatus.CREATED);
		}else {
		
			return new ResponseEntity<String>("Student not Save Successfully", HttpStatus.BAD_REQUEST);
		
	}}
	

}
