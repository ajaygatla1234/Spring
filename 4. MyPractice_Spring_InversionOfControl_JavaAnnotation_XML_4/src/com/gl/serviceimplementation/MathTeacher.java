package com.gl.serviceimplementation;

import org.springframework.stereotype.Component;

import com.gl.service.Teacher;

// Component annotation marks this class as a Spring bean with the default bean id (class name with a lowercase first letter)
@Component
public class MathTeacher implements Teacher {

    // Implementation of the getHomeWork method from the Teacher interface
    public void getHomeWork() {
        System.out.println("Do 10 math problems");
    }
}
