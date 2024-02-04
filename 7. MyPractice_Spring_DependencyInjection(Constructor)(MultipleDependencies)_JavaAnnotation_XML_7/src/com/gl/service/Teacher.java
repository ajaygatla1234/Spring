package com.gl.service;

/**
 * Interface representing a teacher.
 */
public interface Teacher {
	
	/**
	 * Get information about homework assigned by the teacher.
	 */
	void getHomeWork();
	
	/**
	 * Get an exam tip provided by the teacher.
	 *
	 * @return Exam tip as a String.
	 */
	public String getExamTip();

}
