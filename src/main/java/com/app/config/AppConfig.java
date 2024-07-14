package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Employee;
import com.app.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmpId(10023);
		employee.setEmpName("Alex");
		employee.setAge(30);
		employee.setDesignation("System Engineer");
		return employee;
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student();
		student.setsId(2202);
		student.setsName("Mahesh");
		student.setAge(26);
		student.setCourse("Machine Learning");
		return student;
	}
}
