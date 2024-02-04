package com.gl.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

@Component
public class MathTeacher implements Teacher {

	// Defining a private field or dependency
	ExamTip examTip;

	// Autowired constructor with Qualifier annotation for dependency injection
	public MathTeacher() {
		// Default constructor
	}

	@Autowired
	public MathTeacher(@Qualifier("solvePreviousYearsPapers") ExamTip examTip) {
		this.examTip = examTip;
	}

	/**
	 * Get information about the homework assigned by the Math Teacher.
	 */
	@Override
	public void getHomeWork() {
		System.out.println("Do 10 math problems");
	}

	/**
	 * Get an exam tip provided by the Math Teacher.
	 *
	 * @return Exam tip as a String.
	 */
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
