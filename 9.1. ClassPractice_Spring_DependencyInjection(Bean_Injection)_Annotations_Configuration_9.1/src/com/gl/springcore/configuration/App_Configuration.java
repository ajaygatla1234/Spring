package com.gl.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gl.springcore.beans.*;

@Configuration
public class App_Configuration {

	// Bean definition for the 'Address' class
	@Bean
	public Address address() {
		return new Address();
	}

	// Bean definition for the 'Employee' class
	@Bean
	public Employee Employee() {

		// Create an instance of Employee
		Employee employee = new Employee();
		
		// Inject the Address bean into the Employee
		employee.setAddress(address());
		
		// Return the configured Employee bean
		return employee;
	}
}
