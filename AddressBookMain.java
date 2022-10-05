package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		String firstName, lastName, address, city, state, zip, phoneNumber, eamil;
		System.out.println("Welcome to Address Book Program");
		Scanner scanner = new Scanner(System.in);
		AddressBookMain addressBook = new AddressBookMain();
		System.out.println("Enter 4 person details: ");
		for (int number = 1; number <= 4; number++) {
			System.out.println("");
			System.out.println("Person "+number+" : ");
			System.out.print("First Name : ");
			firstName = scanner.nextLine();
			System.out.print("Last Name : ");
			lastName = scanner.nextLine();
			System.out.print("Address : ");
			address = scanner.nextLine();
			System.out.print("City : ");
			city = scanner.nextLine();
			System.out.print("State : ");
			state = scanner.nextLine();
			System.out.print("Zip : ");
			zip = scanner.nextLine();
			System.out.print("Phone Number : ");
			phoneNumber = scanner.nextLine();
			System.out.print("Email : ");
			eamil = scanner.nextLine();
			addressBook.addContact(firstName, lastName, address, city, state, zip, phoneNumber, eamil);	
		}
		addressBook.showContacts();
		scanner.close();
	}

	private void showContacts() {
		// TODO Auto-generated method stub
		
	}

	private void addContact(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String eamil) {
		// TODO Auto-generated method stub
		
	}

}