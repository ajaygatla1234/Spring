package com.gl.springcore.beans;

public class Address {
    private String street;
    private String city;
    private String zipCode;

    // Getters and setters for the 'street' property
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

    // Getters and setters for the 'city' property
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

    // Getters and setters for the 'zipCode' property
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

    // Overriding the 'toString' method to provide a string representation of the Address
	@Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
    }
}
