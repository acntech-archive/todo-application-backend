package com.accenture.todolist.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.accenture.todolist.config.RestRepositoryConfiguration;
import com.accenture.todolist.config.SpringScanningConfiguration;

@SpringBootApplication
@Import({
		RestRepositoryConfiguration.class,
		SpringScanningConfiguration.class
})
public class TodoListApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TodoListApplication.class, args);
	}

}
