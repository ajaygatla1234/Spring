package com.gl.serviceimplementation;

import org.springframework.stereotype.Component;

import com.gl.service.Teacher;

// Component annotation marks this class as a Spring bean
@Component("customName") // You can specify a custom name as the bean id, otherwise, the default is "gKTeacher"
public class GKTeacher implements Teacher {

    // Implementation of the getHomeWork method from the Teacher interface
    public void getHomeWork() {
        System.out.println("Go through current affairs");
    }
}
