package com.gl.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Main class to demonstrate constructor injection in Spring
public class Main {

    public static void main(String[] args) {

        // Create an application context based on the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Employee bean from the XML file
        Employee employee = (Employee) context.getBean("employee");

        // Invoke methods to display employee details
        System.out.println("Employee ID: " + employee.getiD());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Address - Flat No: " + employee.getAddress().getFlatNo());
        System.out.println("Employee Address - Apartment Name: " + employee.getAddress().getAppartmentName());
        System.out.println("Employee Address - Area: " + employee.getAddress().getArea());
        System.out.println("Employee Address - City: " + employee.getAddress().getCity());
    }
}
