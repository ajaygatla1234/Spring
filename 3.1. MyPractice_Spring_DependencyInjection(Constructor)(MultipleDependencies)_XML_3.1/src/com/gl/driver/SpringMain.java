package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimplementation.HindiTeacher;
import com.gl.serviceimplementation.MathTeacher;

// Main class to demonstrate Spring application with Teacher interface and ExamTip dependency
public class SpringMain {

    public static void main(String[] args) {

        // 1. Load the Spring configuration class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve Bean from Spring Container
        Teacher teacher1 = context.getBean("mathTeacher", MathTeacher.class);
        Teacher teacher2 = context.getBean("hindiTeacher", HindiTeacher.class);

        // 3. Call method on the bean
        System.out.println("Math Teacher's Homework:");
        teacher1.getHomeWork();

        System.out.println("\nHindi Teacher's Homework:");
        teacher2.getHomeWork();

        // Display exam tips
        System.out.println("\nMath Teacher's Exam Tip:");
        System.out.println(teacher1.getExamTip());

        System.out.println("\nHindi Teacher's Exam Tip:");
        System.out.println(teacher2.getExamTip());

        // 4. Close the context
        context.close();
    }
}
