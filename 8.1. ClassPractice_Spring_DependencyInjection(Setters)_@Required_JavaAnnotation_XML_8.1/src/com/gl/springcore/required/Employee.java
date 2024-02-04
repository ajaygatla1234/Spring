package com.gl.springcore.required;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String name;
	private String designation;
	private String company;

	// Getter for name
	public String getName() {
		return name;
	}

	/*
	 * Setter for name.
	 * If @Required annotation is used, it enforces that this property must be set, 
	 * and it cannot be null. An exception will be thrown if the property is not set.
	 */
	/*
	 * (if @Required annotation is not used, it can accept null 
	 * i.e. if we have not passed the value also it will be okay, 
	 * but if we used @Required annotation then it cannot be null, 
	 * we must pass the value, otherwise exceptions occur)
	 * */
	@Required  
	public void setName(String name) {
		this.name = name;
	}

	// Getter for designation
	public String getDesignation() {
		return designation;
	}

	/*
	 * Setter for designation.
	 * If @Required annotation is used, it enforces that this property must be set, 
	 * and it cannot be null. An exception will be thrown if the property is not set.
	 */
	@Required
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// Getter for company
	public String getCompany() {
		return company;
	}

	/*
	 * Setter for company.
	 * If @Required annotation is used, it enforces that this property must be set, 
	 * and it cannot be null. An exception will be thrown if the property is not set.
	 */
	@Required
	public void setCompany(String company) {
		this.company = company;
	}

	// toString method for providing a string representation of the Employee object
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", company=" + company + "]";
	}
}
