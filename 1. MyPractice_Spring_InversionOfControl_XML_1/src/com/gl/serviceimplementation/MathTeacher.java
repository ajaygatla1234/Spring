package com.gl.serviceimplementation;

import com.gl.service.Teacher;

// Implementation of the Teacher interface for a Math Teacher
public class MathTeacher implements Teacher {

    // Implementation of the getHomeWork method specified in the Teacher interface
    public void getHomeWork() {
        // Output a message specific to the MathTeacher's homework
        System.out.println("Do 10 math problems for your homework.");
    }

}
