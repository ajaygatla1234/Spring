package com.gl.serviceimplementation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gl.service.Teacher;

// Component annotation indicates that this class is a Spring bean
@Component // The default bean id will be the class name with the first letter in lowercase (mathTeacher)
@Scope("singleton") // Scope annotation defines the scope of the bean (singleton in this case)
public class MathTeacher implements Teacher {

    // Method to get homework details
    public void getHomeWork() {
        System.out.println("Do 10 math problems");
    }

    // @PostConstruct annotation indicates a method to be invoked after the bean is constructed
    @PostConstruct
    public void insidePostConstruct() {
        System.out.println("Inside the @PostConstruct");
    }

    // @PreDestroy annotation indicates a method to be invoked before the bean is destroyed
    @PreDestroy
    public void insidePreDestroy() {
        System.out.println("Inside the @PreDestroy");
    }
}
