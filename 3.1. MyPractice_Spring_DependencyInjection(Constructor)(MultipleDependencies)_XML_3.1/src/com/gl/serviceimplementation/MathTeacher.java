package com.gl.serviceimplementation;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

// Implementation class for Teacher interface, specialized as MathTeacher
public class MathTeacher implements Teacher {

    // Field representing the dependency on ExamTip
    ExamTip examTip;

    // Default constructor
    public MathTeacher() {
        // Default constructor for cases where ExamTip dependency is not provided
    }

    // Constructor for dependency injection of ExamTip
    public MathTeacher(ExamTip examTip) {
        this.examTip = examTip;
    }

    // Method to get homework for MathTeacher
    public void getHomeWork() {
        System.out.println("Do 10 math problems");
    }

    // Implementation of the method to get exam tips from ExamTip dependency
    @Override
    public String getExamTip() {
        return examTip.getExamTip();
    }
}
