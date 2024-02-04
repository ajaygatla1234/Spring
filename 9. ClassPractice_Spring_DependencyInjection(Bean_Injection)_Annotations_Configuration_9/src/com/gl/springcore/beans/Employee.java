package com.gl.springcore.beans;

public class Employee {
	
	// Fields to represent employee details
	private String name;
	private String designation;
	private String company;
	
	// Getter method for retrieving employee name
	public String getName() {
		return name;
	}
	
	// Setter method for setting employee name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter method for retrieving employee designation
	public String getDesignation() {
		return designation;
	}
	
	// Setter method for setting employee designation
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	// Getter method for retrieving employee company
	public String getCompany() {
		return company;
	}
	
	// Setter method for setting employee company
	public void setCompany(String company) {
		this.company = company;
	}
	
	// Overridden toString method to provide a string representation of the employee
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", company=" + company + "]";
	}	
}
