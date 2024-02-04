package com.gl.serviceimplementation;

import com.gl.service.ExamTip;

// Implementation class for ExamTip interface, providing a tip to solve previous years' papers
public class SolvePreviousYearsPapers implements ExamTip {

    // Method to get an exam tip related to solving previous years' papers
    @Override
    public String getExamTip() {
        return "Solve last 5 years question papers";
    }
}
