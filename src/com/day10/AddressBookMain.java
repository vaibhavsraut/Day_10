package com.day10;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBookSystem addressBookSystem = new AddressBookSystem();

        addressBookSystem.addAddressBook("Personal");
        addressBookSystem.addAddressBook("Work");

        AddressBook addressBook = new AddressBook();

        Contact contact1 = new Contact("John", "Doe", "123 Main St", "City1", "State1", "12345", "123-456-7890", "john.doe@example.com");
        addressBook.addContact(contact1);

        System.out.println("Enter details for a new contact:");
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Address: ");
        String address = scanner.next();
        System.out.print("City: ");
        String city = scanner.next();
        System.out.print("State: ");
        String state = scanner.next();
        System.out.print("Zip: ");
        String zip = scanner.next();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();

        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);

    }
}
