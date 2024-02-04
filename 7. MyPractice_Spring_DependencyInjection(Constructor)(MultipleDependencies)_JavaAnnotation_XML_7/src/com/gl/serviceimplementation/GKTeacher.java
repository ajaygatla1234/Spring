package com.gl.serviceimplementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

@Component
public class GKTeacher implements Teacher {
	
	// Defining a private field or dependency
	ExamTip examTip;
	
	// Define a constructor for dependency injection with Qualifier annotation
	public GKTeacher(@Qualifier("revisionTip") ExamTip examTip) {
		this.examTip = examTip;
	}

	/**
	 * Get information about the homework assigned by the GK Teacher.
	 */
	@Override
	public void getHomeWork() {
		System.out.println("Go through current affairs");
	}

	/**
	 * Get an exam tip provided by the GK Teacher.
	 *
	 * @return Exam tip as a String.
	 */
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
