package com.gl.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Main class for the Spring Core application
public class Main {

    public static void main(String[] args) {

        // First, add all the JAR files related to Spring to the build path from the SpringCoreJarFiles-updated folder

        // Creating a Spring application context by loading the configuration from "applicationContext.xml"
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Alternatively, you can use ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // ApplicationContext is the Interface & ClassPathXmlApplicationContext is the concrete implementation class of ApplicationContext
        // i.e., ClassPathXmlApplicationContext implements ApplicationContext

        // Retrieving the Hi_World bean from the Spring container
        Hi_World hi_World = (Hi_World) context.getBean("hiWorld");
        // Alternatively, you can use Hi_World hi_World = context.getBean("hiWorld", Hi_World.class);
        System.out.println(hi_World.getWish());

        // Retrieving the Hello_World bean from the Spring container
        Hello_World hello_World = context.getBean("helloWorld", Hello_World.class);
        System.out.println(hello_World.getWish());

        // Closing the Spring context to release resources
        context.close();
    }
}
