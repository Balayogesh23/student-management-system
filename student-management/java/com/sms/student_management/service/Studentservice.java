package com.sms.student_management.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.student_management.model.Student;
import com.sms.student_management.repository.StudentRepository;


@Service
public class Studentservice {
@Autowired
private StudentRepository repo;
public Student saveStudent(Student student)
{
      return repo.save(student);
}
public List<Student> getAllStudent()
{
	return repo.findAll();
}
public Student getStudentByid(int id)
{
	return repo.findById(id).orElse(null);
}
public void delStudent(int id)
{
	repo.deleteById(id);
}



}
