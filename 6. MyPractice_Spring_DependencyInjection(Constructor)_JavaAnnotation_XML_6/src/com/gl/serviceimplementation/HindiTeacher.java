package com.gl.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

@Component
// Implementation of Teacher interface for Hindi subject
public class HindiTeacher implements Teacher {
	
	// Dependency injection of ExamTip
	ExamTip examTip;

	// Constructor for dependency injection
	@Autowired
	public HindiTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	// Method to get homework for Hindi
	public void getHomeWork() {
		System.out.println("Do Hindi homework");
	}

	// Method to get exam tips for Hindi
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
