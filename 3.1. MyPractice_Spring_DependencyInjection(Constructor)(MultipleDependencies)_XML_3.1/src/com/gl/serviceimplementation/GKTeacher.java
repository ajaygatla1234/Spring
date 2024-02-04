package com.gl.serviceimplementation;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

// Implementation class for Teacher interface, specialized as GKTeacher
public class GKTeacher implements Teacher {
    
    // Private field representing the dependency on ExamTip
    ExamTip examTip;
    
    // Constructor for dependency injection of ExamTip
    public GKTeacher(ExamTip examTip) {
        this.examTip = examTip;
    }

    // Method to get homework for GKTeacher
    public void getHomeWork() {
        System.out.println("Go through current affairs");
    }

    // Implementation of the method to get exam tips from ExamTip dependency
    @Override
    public String getExamTip() {
        return examTip.getExamTip();
    }
}
