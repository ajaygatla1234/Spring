package com.gl.serviceimplementation;

import com.gl.service.ExamTip;

// Implementation of the ExamTip interface for providing a revision tip
public class RevisionTip implements ExamTip {

    // Implementation of the getExamTip method specified in the ExamTip interface
    @Override
    public String getExamTip() {
        // Return a revision tip message
        return "Do a lot of revision to prepare for the exam.";
    }
}
