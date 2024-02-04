package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimplementation.HindiTeacher;
import com.gl.serviceimplementation.MathTeacher;

// Main class for the Spring application
public class SpringMain {

    public static void main(String[] args) {

        // 1. Load the Spring configuration class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve Bean from Spring Container

        // Retrieve a MathTeacher bean
        Teacher teacher1 = context.getBean("mathTeacher", MathTeacher.class);

        // Retrieve a HindiTeacher bean
        Teacher teacher2 = context.getBean("hindiTeacher", HindiTeacher.class);

        // 3. Call methods on the beans

        // Call getHomeWork method for MathTeacher and HindiTeacher instances
        teacher1.getHomeWork();
        teacher2.getHomeWork();

        // Call getExamTip method for MathTeacher and HindiTeacher instances and print the results
        System.out.println("MathTeacher Exam Tip: " + teacher1.getExamTip());
        System.out.println("HindiTeacher Exam Tip: " + teacher2.getExamTip());

        // 4. Close the context
        context.close();
    }
}
