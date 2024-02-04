package com.gl.serviceimplementation;

import com.gl.service.ExamTip;

// Implementation class for ExamTip interface, providing a revision tip
public class RevisionTip implements ExamTip {

    // Method to get an exam tip related to revision
    @Override
    public String getExamTip() {
        return "Do a lot of Revision";
    }
}
