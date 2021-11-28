package com.managecredential.main;

import java.util.Scanner;

import com.managecredential.credentialservice.CredentialService;
import com.managecredential.credentialservice.Employee;


public class Base{
	public static void main(String args[]) {
		Employee employee = new Employee("Dhivya","Sambath");
		CredentialService credential = new CredentialService();
		String email;
		char[] password = new char[8];
		Scanner scanner = new Scanner(System.in);
		String name = employee.getFirstName() + employee.getLastName();

		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		
		int department = scanner.nextInt();

		switch(department) {
		case 1:
			email = credential.generateemailaddress(employee.getFirstName(),employee.getLastName(),"tech");
			password = credential.generatepassword();
		    credential.showcredentials(name, email, password);
			break;
		case 2:
			email = credential.generateemailaddress(employee.getFirstName(),employee.getLastName(),"ad");
			password = credential.generatepassword();
		    credential.showcredentials(name, email, password);
			break;
		case 3:
			email = credential.generateemailaddress(employee.getFirstName(),employee.getLastName(),"hr");
			password = credential.generatepassword();
		    credential.showcredentials(name, email, password);
			break;
		case 4:
			email = credential.generateemailaddress(employee.getFirstName(),employee.getLastName(),"lg");
			password = credential.generatepassword();
		    credential.showcredentials(name, email, password);
			break;
		case 5:
			System.out.println("Enter valid option");
		}
	
}
	
}