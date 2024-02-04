package com.gl.springcore.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Load the Spring configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve an Employee bean from the Spring container
		Employee emp = (Employee) context.getBean(Employee.class);
		
		// Print the initial values of name and designation (which may be null)
		System.out.println("Initial values - Name: " + emp.getName() + ", Designation: " + emp.getDesignation());
		System.out.println();
		
		// Set the name for the Employee
		emp.setName("subbu");
		
		// Print the updated Employee details using toString method
		System.out.println("Employee details after setting the name: " + emp.toString());
	}
}
