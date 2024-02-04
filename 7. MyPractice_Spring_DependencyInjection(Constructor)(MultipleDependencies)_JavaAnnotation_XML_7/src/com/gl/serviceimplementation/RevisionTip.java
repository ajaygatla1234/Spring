package com.gl.serviceimplementation;

import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;

/**
 * Implementation of the ExamTip interface providing a tip for exam preparation.
 * This class advises students to do a lot of revision as an exam preparation strategy.
 */
@Component
public class RevisionTip implements ExamTip {

	/**
	 * Get an exam tip recommending to do a lot of revision.
	 *
	 * @return Exam tip as a String.
	 */
	@Override
	public String getExamTip() {
		return "Do a lot of Revision";
	}
}
