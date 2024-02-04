package com.gl.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

@Component
// Implementation of Teacher interface for Math subject
public class MathTeacher implements Teacher {

	// Dependency injection of ExamTip
	ExamTip examTip;

	// Default constructor
	public MathTeacher() {

	}

	// Constructor for dependency injection
	@Autowired
	public MathTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	// Method to get homework for Math
	public void getHomeWork() {
		System.out.println("Do 10 math problems");
	}

	// Method to get exam tips for Math
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
