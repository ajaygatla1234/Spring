package com.gl.serviceimplementation;

import org.springframework.stereotype.Component;

import com.gl.service.ExamTip;

/**
 * Implementation of the ExamTip interface providing a tip for exam preparation.
 * This class advises students to solve last 5 years question papers as an exam preparation strategy.
 */
@Component
public class SolvePreviousYearsPapers implements ExamTip {

	/**
	 * Get an exam tip recommending to solve last 5 years question papers.
	 *
	 * @return Exam tip as a String.
	 */
	@Override
	public String getExamTip() {
		return "Solve last 5 years question Papers";
	}
}
