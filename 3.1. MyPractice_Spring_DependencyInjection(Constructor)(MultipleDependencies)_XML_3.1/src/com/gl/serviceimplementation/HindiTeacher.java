package com.gl.serviceimplementation;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

// Implementation class for Teacher interface, specialized as HindiTeacher
public class HindiTeacher implements Teacher {
    
    // Field representing the dependency on ExamTip
    ExamTip examTip;

    // Constructor for dependency injection of ExamTip
    public HindiTeacher(ExamTip examTip) {
        this.examTip = examTip;
    }

    // Method to get homework for HindiTeacher
    public void getHomeWork() {
        System.out.println("Do Hindi homework");
    }

    // Implementation of the method to get exam tips from ExamTip dependency
    @Override
    public String getExamTip() {
        return examTip.getExamTip();
    }
}
