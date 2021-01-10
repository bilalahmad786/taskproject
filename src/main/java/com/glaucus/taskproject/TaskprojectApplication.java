package com.glaucus.taskproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(value = "com.glaucus.taskproject")
public class TaskprojectApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TaskprojectApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TaskprojectApplication.class, args);
	}

}
