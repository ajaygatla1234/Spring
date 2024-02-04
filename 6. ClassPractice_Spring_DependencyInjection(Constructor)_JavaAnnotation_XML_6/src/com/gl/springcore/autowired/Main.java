package com.gl.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        // Create an application context based on the Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the Text_Editor bean from the context
        Text_Editor te = (Text_Editor) context.getBean("textEditor");
        
        // Invoke the spellCheck method, which internally calls checkSpelling()
        te.spellCheck(); // This goes to the spellCheck() method in the Text_Editor class, and within it, checkSpelling() is called, resulting in the output.
    }
}
