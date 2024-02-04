package com.gl.serviceimplementation;

import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;

@Component
// Implementation of ExamTip interface providing a revision tip
public class RevisionTip implements ExamTip {

	// Method to get the exam tip related to revision
	@Override
	public String getExamTip() {
		return "Do a lot of Revision";
	}
}
