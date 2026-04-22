package com.sms.student_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.student_management.dao.StudentDAO;
import com.sms.student_management.model.Student;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
//		
//		Student s=new Student();
//		s.setName("Bala");
//		s.setEmail("bala@gamil.com");
//		s.setCourse("Java");

		
		
	}

}
