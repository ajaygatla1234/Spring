package com.gl.serviceimplementation;

import com.gl.service.Teacher;

// Implementation of the Teacher interface for a Hindi Teacher
public class HindiTeacher implements Teacher {

    // Implementation of the getHomeWork method specified in the Teacher interface
    public void getHomeWork() {
        // Output a message specific to the HindiTeacher's homework
        System.out.println("Do Hindi homework for your assignment.");
    }

}
