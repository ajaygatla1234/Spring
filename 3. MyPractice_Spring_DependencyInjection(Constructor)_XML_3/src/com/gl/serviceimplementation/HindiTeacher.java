package com.gl.serviceimplementation;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

// Implementation of the Teacher interface for a Hindi Teacher
public class HindiTeacher implements Teacher {

    // Dependency for ExamTip
    ExamTip examTip;

    // Constructor for dependency injection
    public HindiTeacher(ExamTip examTip) {
        this.examTip = examTip;
    }

    // Implementation of the getHomeWork method specified in the Teacher interface
    public void getHomeWork() {
        // Output a message specific to the HindiTeacher's homework
        System.out.println("Do Hindi homework for your assignment.");
    }

    // Implementation of the getExamTip method specified in the Teacher interface
    @Override
    public String getExamTip() {
        // Delegate to the injected ExamTip object to provide the exam tip
        return examTip.getExamTip();
    }
}
