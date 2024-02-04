package com.gl.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gl.springcore.beans.Employee;
import com.gl.springcore.configuration.App_Configuration;

public class Main_App {

	public static void main(String[] args) {
		// Creating an application context using the configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(App_Configuration.class);
		
		// Retrieving an Employee bean from the context
		Employee employee = context.getBean(Employee.class);
		
		// Setting the name of the employee
		employee.setName("Subbu");
		
		// Displaying the name of the employee
		System.out.println("Employee Name: " + employee.getName());
	}
}
