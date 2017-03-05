package com.accenture.todolist.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.accenture.todolist.domain.Todo;

@Configuration
@ComponentScan(basePackageClasses = {
        RestRepositoryConfiguration.class
})
@EntityScan(basePackageClasses = {
        Todo.class
})
public class SpringScanningConfiguration {
}
