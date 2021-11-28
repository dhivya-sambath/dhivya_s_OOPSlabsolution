package com.managecredential.credentialservice;

import java.util.Random;
import java.util.Scanner;

public class CredentialService{
	Scanner in = new Scanner(System.in);
    
	
	public String generateemailaddress(String fname, String lname, String department) {
		
		String email = fname + lname +"@"+ department + "." + "urjanet" + "." + "com";
		return email;
	}
	
	
	public char[]  generatepassword() {
		 
        String small = "abcdefghijklmnopqrstuvwxyz";
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        String special_char ="!@#$%^&*_=+-/.?<>)";
        
        String values = small + capital + number + special_char;
        int randomindex;
        Random random = new Random();
        char password[] = new char[8];
        for(int i=0;i<8;i++) {
        	randomindex = random.nextInt(values.length()-1);
        	password[i]=values.charAt(randomindex);
        }
		return password;
		
	}
	
	public void showcredentials(String name, String email, char[] password) {
		System.out.println("Dear "+ name + " your generated credentials are as follows");
		System.out.println("Email --->" + email.toLowerCase());
		System.out.print("Password ---> ");
		System.out.println(password);
	}
	
}