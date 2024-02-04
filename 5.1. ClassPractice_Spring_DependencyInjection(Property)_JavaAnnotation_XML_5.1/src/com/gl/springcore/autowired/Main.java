package com.gl.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Create and initialize the Spring application context by loading the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the Text_Editor bean from the context
        Text_Editor textEditor = (Text_Editor) context.getBean("textEditor");

        // Call the spellCheck method on the Text_Editor bean
        textEditor.spellCheck();
    }
}
