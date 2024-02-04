package com.gl.springcore.constructorinjection;

// Class representing an Employee with properties for ID, name, and address
public class Employee {
    
    // Property representing employee ID
    int iD;
    
    // Property representing employee name
    String name;
    
    // Property representing employee's address
    Address address;

    // Constructor for initializing Employee with ID, name, and address
    public Employee(int iD, String name, Address address) {
        super();
        this.iD = iD;
        this.name = name;
        this.address = address;
    }

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

    // Getter method for retrieving employee's address
    public Address getAddress() {
        return address;
    }

    // Setter method for setting employee's address
    public void setAddress(Address address) {
        this.address = address;
    }
}
