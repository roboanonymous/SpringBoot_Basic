package com.example.Gradle_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GradleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleSpringApplication.class, args);
	}

}
