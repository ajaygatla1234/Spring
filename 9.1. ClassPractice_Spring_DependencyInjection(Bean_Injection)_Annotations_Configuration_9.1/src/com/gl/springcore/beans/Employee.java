package com.gl.springcore.beans;

public class Employee {
	
	private String name;
	private String designation;
	private String company;
	Address address;
	
	
	// Getter and setter for the 'name' property
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter and setter for the 'designation' property
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	// Getter and setter for the 'company' property
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// Getter and setter for the 'address' property
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	// Overriding the 'toString' method to provide a string representation of the Employee
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", company=" + company + "]";
	}	
}
