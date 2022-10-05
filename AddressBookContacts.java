package com.AddressBook;


import java.util.Scanner;

public class AddressBookContacts
{
	public static void showContacts() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name");
		
		String firstName = scanner.next();
		System.out.println("Enter the last name");
		
		String lastName = scanner.next();
		System.out.println("Enter the city");
		
		String city = scanner.next();
		System.out.println("Enter the state");
		
		String state = scanner.next();
		System.out.println("Enter the zip");
		
		long zip = scanner.nextLong();
		System.out.println("Enter the phone number");
		
		long phonenum = scanner.nextLong();
		System.out.println("Enter the email");
		
		String email = scanner.next();
		scanner.close();
		
		System.out.println(firstName + " " + lastName +" " + city + " " + state + " " + zip + " " + phonenum + " " + email);
		
	}
	
	public static void main(String args[]) 
	 {
		   showContacts();
	 }

}
