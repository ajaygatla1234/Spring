package com.gl.springcore.setterinjection;

// Class representing an Employee with properties for ID, name, and an Address reference
public class Employee {
	
    // Property representing employee ID
    int iD;
    
    // Property representing employee name
    String name;
    
    // Property representing employee address (Reference to Address class)
    Address address;

    // Getter method for retrieving employee ID
    public int getiD() {
        return iD;
    }

    // Setter method for setting employee ID
    public void setiD(int iD) {
        this.iD = iD;
    }

    // Getter method for retrieving employee name
    public String getName() {
        return name;
    }

    // Setter method for setting employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for retrieving employee address
    public Address getAddress() {
        return address;
    }

    // Setter method for setting employee address
    public void setAddress(Address address) {
        this.address = address;
    }
}
