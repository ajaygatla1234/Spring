package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimplementation.HindiTeacher;
import com.gl.serviceimplementation.MathTeacher;

public class SpringMain {

    public static void main(String[] args) {

        // 1. Load the Spring configuration class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve Bean from Spring Container

        // Retrieve two MathTeacher beans
        Teacher teacher1 = context.getBean("mathTeacher", MathTeacher.class);
        Teacher teacher2 = context.getBean("mathTeacher", MathTeacher.class);

        // Check if the references point to the same object
        if (teacher1 == teacher2) {
            System.out.println("MathTeacher beans are the same instance: " + true);
        } else {
            System.out.println("MathTeacher beans are different instances: " + false);
        }

        // Retrieve two HindiTeacher beans
        Teacher teacher3 = context.getBean("hindiTeacher", HindiTeacher.class);
        Teacher teacher4 = context.getBean("hindiTeacher", HindiTeacher.class);

        // Check if the references point to the same object
        if (teacher3 == teacher4) {
            System.out.println("HindiTeacher beans are the same instance: " + true);
        } else {
            System.out.println("HindiTeacher beans are different instances: " + false);
        }

        // 3. Call method on the bean

        // Call getHomeWork method on MathTeacher and HindiTeacher instances
        teacher1.getHomeWork();
        teacher4.getHomeWork();

        // 4. Close the context
        context.close();
    }
}
