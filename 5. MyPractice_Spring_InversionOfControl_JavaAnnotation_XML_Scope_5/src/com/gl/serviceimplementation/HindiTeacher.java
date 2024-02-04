package com.gl.serviceimplementation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gl.service.Teacher;

// Component annotation indicates that this class is a Spring bean
@Component("customName") // We can add our custom name as the bean id
@Scope("prototype") // Scope annotation defines the scope of the bean (prototype in this case)
public class HindiTeacher implements Teacher {

    // Method to get homework details
    public void getHomeWork() {
        System.out.println("Do Hindi homework");
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
