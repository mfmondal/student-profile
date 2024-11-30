package com.mondal.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:application-context.xml"})
@SpringBootApplication
public class StudentProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentProfileApplication.class, args);
	}

}
