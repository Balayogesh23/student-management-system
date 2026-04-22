package com.sms.student_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.student_management.model.Student;
import com.sms.student_management.service.Studentservice;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class Studentcontroller {
@Autowired
private Studentservice service;
@PostMapping
public Student addStudent(@RequestBody Student student)
{
	return service.saveStudent(student);
}
@GetMapping
public List<Student> getStudent()
{
	return service.getAllStudent();
}
@GetMapping("/{id}")
public Student getStudent(@PathVariable int id)
{
	return service.getStudentByid(id);
}
@DeleteMapping("/{id}")
public void delestudent(@PathVariable int id)
{
	service.delStudent(id);
}
@PutMapping("/{id}")
public Student updateStudent(@PathVariable int id,@RequestBody Student student)
{
	return service.updateStudent(id, student);
}

}
