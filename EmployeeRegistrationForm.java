package com.dhathika.clonning;

import java.util.Scanner;

public class EmployeeRegistrationForm {

	public static void main(String[] args) {
	System.out.println("Employee Registratin Form");
	System.out.println("Enter employee details ");
	
	Scanner sc = new Scanner(System.in);
	
	Employee emp = new Employee();

	System.out.println("Enter employee id");
	emp.setEmpId(sc.nextInt());
	System.out.println("Enter employee name");
	emp.setEmpName(sc.next());
	System.out.println("Enter employee salary");
	emp.setEmpSal(sc.nextDouble());
	System.out.println("Enter employee age");
	emp.setEmpAge(sc.nextInt()); 
	System.out.println("Enter employee contact ");
	emp.setEmpContact(sc.nextLong());
	System.out.println("Enter employee Gender");
	emp.setEmpGender(sc.next().charAt(0));
	
	// Address details 
	Address address = new Address();
	System.out.println("Enter plot number ");
	address.setPin(sc.nextInt());
	System.out.println("Enter locality");
	address.setLocality(sc.next());
	System.out.println("Enter city");
	address.setCity(sc.next());
	System.out.println("Enter state");
	address.setState(sc.next());
	System.out.println("Enter country");
	address.setCountry(sc.next());
	System.out.println("Enter pincode");
	address.setPin(sc.nextLong());
	
	emp.setAddress(address);
	
	// Positions values 

	Position position = new Position();
	System.out.println("Ente Position details ");
	System.out.println("Enter the garde");
	position.setGrade(sc.next());
	System.out.println("Enter the designation");
	position.setDesignation(sc.next());
	emp.setPosition(position);
	
	System.out.println("Employee tax is  ");
	
	TaxCalculator taxcalc = new TaxCalculator();
	System.out.println("Employee must pay the tax : " + taxcalc.annualTaxCalicultor(emp));
	
	}
	
	

}
