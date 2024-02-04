package com.gl.serviceimplementation;

import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

@Component
// Implementation of Teacher interface for General Knowledge subject
public class GKTeacher implements Teacher {
	
	// Defining private field for dependency injection
	ExamTip examTip;
	
	// Constructor for dependency injection
	public GKTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	// Method to get homework for General Knowledge
	public void getHomeWork() {
		System.out.println("Go through current affairs");
	}

	// Method to get exam tips for General Knowledge
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
