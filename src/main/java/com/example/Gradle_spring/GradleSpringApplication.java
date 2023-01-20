package com.example.Gradle_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GradleSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(GradleSpringApplication.class, args);

		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
