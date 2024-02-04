package com.gl.serviceimplementation;

import org.springframework.stereotype.Component;

import com.gl.service.Teacher;

// Component annotation marks this class as a Spring bean with the custom name "customName"
@Component("customName")
public class HindiTeacher implements Teacher {

    // Implementation of the getHomeWork method from the Teacher interface
    public void getHomeWork() {
        System.out.println("Do Hindi homework");
    }
}
