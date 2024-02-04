package com.gl.springcore.setterinjection;

// Class representing an Address with properties for flat number, apartment name, area, and city
public class Address {
	
    // Property representing flat number
    int flatNo;
    
    // Property representing apartment name
    String appartmentName;
    
    // Property representing area
    String area;
    
    // Property representing city
    String city;
    
    // Getter method for retrieving flat number
    public int getFlatNo() {
        return flatNo;
    }

    // Setter method for setting flat number
    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    // Getter method for retrieving apartment name
    public String getAppartmentName() {
        return appartmentName;
    }

    // Setter method for setting apartment name
    public void setAppartmentName(String appartmentName) {
        this.appartmentName = appartmentName;
    }

    // Getter method for retrieving area
    public String getArea() {
        return area;
    }

    // Setter method for setting area
    public void setArea(String area) {
        this.area = area;
    }

    // Getter method for retrieving city
    public String getCity() {
        return city;
    }

    // Setter method for setting city
    public void setCity(String city) {
        this.city = city;
    }
}
