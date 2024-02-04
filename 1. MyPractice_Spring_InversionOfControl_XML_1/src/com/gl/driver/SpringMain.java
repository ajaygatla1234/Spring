package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimplementation.HindiTeacher;
import com.gl.serviceimplementation.MathTeacher;

public class SpringMain {

    public static void main(String[] args) {

        // 1. Load the Spring configuration class
        // Create a Spring application context by loading the configuration from "applicationContext.xml"
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve Bean from Spring Container
        // Retrieve instances of MathTeacher and HindiTeacher from the Spring container
        Teacher teacher1 = context.getBean("mathTeacher", MathTeacher.class);
        Teacher teacher2 = context.getBean("hindiTeacher", HindiTeacher.class);

        // 3. Call method on the bean
        // Call the getHomeWork method on both MathTeacher and HindiTeacher instances
        teacher1.getHomeWork();
        teacher2.getHomeWork();

        // 4. Close the context
        // Close the Spring context to release resources
        context.close();
    }

}
