package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.service.Teacher;
import com.gl.serviceimplementation.HindiTeacher;
import com.gl.serviceimplementation.MathTeacher;

// Main class to demonstrate Spring application
public class SpringMain {

    public static void main(String[] args) {
        
        // 1. Load the Spring configuration class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 2. Retrieve Bean from Spring Container
        // Here, "mathTeacher" is the bean id defined in the XML configuration for MathTeacher
        // and MathTeacher.class is the expected type of the bean
        Teacher teacher1 = context.getBean("mathTeacher", MathTeacher.class);
        
        // Here, "customName" is the bean id defined in the XML configuration for HindiTeacher
        // and HindiTeacher.class is the expected type of the bean
        Teacher teacher2 = context.getBean("customName", HindiTeacher.class);
        
        // 3. Call method on the bean
        teacher1.getHomeWork();
        teacher2.getHomeWork();

        // 4. Close the context
        context.close();
    }
}
