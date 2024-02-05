package com.gl.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Creating and initializing the Spring ApplicationContext from the XML configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieving the Text_Editor bean from the Spring container
		Text_Editor te = (Text_Editor) context.getBean("textEditor");
		
		// Invoking the spellCheck method on the Text_Editor bean
		te.spellCheck();
	}
}
