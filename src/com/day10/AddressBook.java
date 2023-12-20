package com.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }

    public void editContact(String firstName) {
        Scanner scanner = new Scanner(System.in);
        boolean contactFound = false;

        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                contactFound = true;

                System.out.println("Contact found. What would you like to edit?");
                System.out.println("1. Address");
                System.out.println("2. City");
                System.out.println("3. State");
                System.out.println("4. Zip");
                System.out.println("5. Phone Number");
                System.out.println("6. Email");
                System.out.print("Enter your choice (1-6): ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new address: ");
                        String newAddress = scanner.nextLine();
                        contact.setAddress(newAddress);
                        break;
                    case 2:
                        System.out.print("Enter new city: ");
                        String newCity = scanner.nextLine();
                        contact.setCity(newCity);
                        break;
                    case 3:
                        System.out.print("Enter new state: ");
                        String newState = scanner.nextLine();
                        contact.setState(newState);
                        break;
                    case 4:
                        System.out.print("Enter new zip: ");
                        String newZip = scanner.next();
                        contact.setZip(newZip);
                        break;
                    case 5:
                        System.out.print("Enter new phone number: ");
                        String newPhoneNumber = scanner.next();
                        contact.setPhoneNumber(newPhoneNumber);
                        break;
                    case 6:
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.next();
                        contact.setEmail(newEmail);
                        break;
                    default:
                        System.out.println("Invalid choice. No changes made.");
                        break;
                }

                System.out.println("Contact edited successfully.");
                break;
            }
        }

        if (!contactFound) {
            System.out.println("Contact not found.");
        }
    }

}
