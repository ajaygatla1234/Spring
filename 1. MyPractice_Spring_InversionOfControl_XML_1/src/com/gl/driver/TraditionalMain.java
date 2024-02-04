package com.gl.driver;

import com.gl.service.Teacher;
import com.gl.serviceimplementation.GKTeacher;
import com.gl.serviceimplementation.HindiTeacher;
import com.gl.serviceimplementation.MathTeacher;

public class TraditionalMain {

    public static void main(String[] args) {

        // Creating an instance of HindiTeacher and calling getHomeWork method
//        Teacher teacher = new HindiTeacher();
//        teacher.getHomeWork();

        // Creating an instance of MathTeacher and calling getHomeWork method
//        Teacher teacher = new MathTeacher();
//        teacher.getHomeWork();

        // Creating an instance of GKTeacher and calling getHomeWork method
        Teacher teacher = new GKTeacher();
        teacher.getHomeWork();

    }

}
