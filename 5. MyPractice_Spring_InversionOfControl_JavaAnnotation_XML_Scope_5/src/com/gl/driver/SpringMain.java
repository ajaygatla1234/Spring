package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimplementation.HindiTeacher;
import com.gl.serviceimplementation.MathTeacher;

public class SpringMain {

    public static void main(String[] args) {

        // 1. Load the Spring configuration class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve Beans from Spring Container
        Teacher teacher1 = context.getBean("customName", HindiTeacher.class);
        Teacher teacher2 = context.getBean("customName", HindiTeacher.class);

        Teacher teacher3 = context.getBean("mathTeacher", MathTeacher.class);
        Teacher teacher4 = context.getBean("mathTeacher", MathTeacher.class);

        // Check if the objects are the same for beans with the same id and class
        if (teacher1 == teacher2) {
            System.out.println("Objects of HindiTeacher with customName are the same");
        } else {
            System.out.println("Objects of HindiTeacher with customName are different");
        }

        if (teacher3 == teacher4) {
            System.out.println("Objects of MathTeacher are the same");
        } else {
            System.out.println("Objects of MathTeacher are different");
        }

        // 3. Call methods on the beans
        teacher1.getHomeWork();
        teacher2.getHomeWork();

        // 4. Close the context
        context.close();
    }
}
