package com.gl.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;
import com.gl.service.Teacher;

@Component
public class HindiTeacher implements Teacher {
	
	// Defining a private field or dependency
	ExamTip examTip;

	// Autowired constructor with Qualifier annotation for dependency injection
	@Autowired
	public HindiTeacher(@Qualifier("revisionTip") ExamTip examTip) {
		this.examTip = examTip;
	}

	/**
	 * Get information about the homework assigned by the Hindi Teacher.
	 */
	@Override
	public void getHomeWork() {
		System.out.println("Do Hindi homework");
	}

	/**
	 * Get an exam tip provided by the Hindi Teacher.
	 *
	 * @return Exam tip as a String.
	 */
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
