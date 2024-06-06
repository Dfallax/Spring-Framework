package com.example.practica03;

import com.example.practica03.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
DB --> JDBC -->  Hibernate --> Spring Data JPA
*/
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		var employeeRepo = context.getBean(EmployeeRepository.class);

	}

}
