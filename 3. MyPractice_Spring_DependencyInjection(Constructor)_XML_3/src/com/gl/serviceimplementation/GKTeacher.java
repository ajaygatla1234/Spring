package com.gl.serviceimplementation;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

// Implementation of the Teacher interface for a General Knowledge (GK) Teacher
public class GKTeacher implements Teacher {
    
    // Defining a private field or dependency for ExamTip
    ExamTip examTip;

    // Constructor for dependency injection
    public GKTeacher(ExamTip examTip) {
        this.examTip = examTip;
    }

    // Implementation of the getHomeWork method specified in the Teacher interface
    public void getHomeWork() {
        // Output a message specific to the GKTeacher's homework
        System.out.println("Go through current affairs for your homework.");
    }

    // Implementation of the getExamTip method specified in the Teacher interface
    @Override
    public String getExamTip() {
        // Delegate to the injected ExamTip object to provide the exam tip
        return examTip.getExamTip();
    }

}
