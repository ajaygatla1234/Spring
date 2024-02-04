package com.gl.serviceimplementation;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

// Implementation of the Teacher interface for a Math Teacher
public class MathTeacher implements Teacher {

    // Dependency for ExamTip
    ExamTip examTip;

    // Default constructor (no-argument constructor)
    public MathTeacher() {
        // This constructor is provided for cases where no ExamTip dependency is injected
    }

    // Constructor for dependency injection
    public MathTeacher(ExamTip examTip) {
        this.examTip = examTip;
    }

    // Implementation of the getHomeWork method specified in the Teacher interface
    public void getHomeWork() {
        // Output a message specific to the MathTeacher's homework
        System.out.println("Do 10 math problems for your homework.");
    }

    // Implementation of the getExamTip method specified in the Teacher interface
    @Override
    public String getExamTip() {
        // Delegate to the injected ExamTip object to provide the exam tip
        return examTip.getExamTip();
    }
}
