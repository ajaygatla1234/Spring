package com.gl.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gl.springcore.beans.*;

@Configuration
public class App_Configuration {

	// Bean definition for creating an Employee object
	@Bean
	public Employee Employee() {
		// Instantiating and returning a new Employee object
		return new Employee();
	}
}
