package com.ejemplo.crudfast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudfastApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudfastApplication.class, args);
		/*
		*
        studentService.save(new Student(null, "John", "Doe", "john.doe@example.com"));
        studentService.save(new Student(null, "Jane", "Smith", "jane.smith@example.com"));
        * */
	}

}
