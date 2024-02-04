package com.gl.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gl.springcore.beans.Employee;
import com.gl.springcore.configuration.App_Configuration;

public class Main_App {

	public static void main(String[] args) {
		// Create an application context using the configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(App_Configuration.class);
		
		// Retrieve the Employee bean from the context
		Employee employee = context.getBean(Employee.class);
		
		// Set the name and address details for the employee
		employee.setName("Subbu");
		employee.getAddress().setCity("Hyderabad");
		
		// Print the employee details
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee City: " + employee.getAddress().getCity());
	}
}
