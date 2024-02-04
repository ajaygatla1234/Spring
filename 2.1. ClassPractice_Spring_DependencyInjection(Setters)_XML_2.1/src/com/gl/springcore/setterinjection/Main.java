package com.gl.springcore.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Main class for the Setter Injection example
public class Main {

	public static void main(String[] args) {

		// Creating a Spring application context by loading the configuration from "applicationContext.xml"
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Get the beans from xml file
		//Address address = (Address)context.getBean("address");
		//not Hello_World hello_World = new Hello_World hello_World(); not pulling the bean
		//we have to Inject the bean


		// Getting the Employee bean from the Spring container
		Employee employee = (Employee) context.getBean("employee");

		// Invoking the methods and printing the details
		System.out.println("Employee ID: " + employee.getiD());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee Address - Flat No: " + employee.getAddress().getFlatNo());
		System.out.println("Employee Address - Apartment Name: " + employee.getAddress().getAppartmentName());
		System.out.println("Employee Address - Area: " + employee.getAddress().getArea());
		System.out.println("Employee Address - City: " + employee.getAddress().getCity());
	}
}



