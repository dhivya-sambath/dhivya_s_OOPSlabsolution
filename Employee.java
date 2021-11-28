package com.managecredential.credentialservice;



public class Employee{
    String firstname;
    String lastname;
    
    public  Employee (String firstname, String lastname) {
    	this.lastname = lastname;
    	this.firstname = firstname;
    }
    
    
    public String getFirstName() {
    	return firstname;
    }
    
    public void setFirstName(String firstname) {
    	this.firstname = firstname;
    }
    
    public String getLastName() {
    	return lastname;
    }
    
    public void setLastName(String lastname) {
    	this.lastname =lastname;
    }
}