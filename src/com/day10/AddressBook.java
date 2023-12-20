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

    public void deleteContact(String firstName) {
        int indexToRemove = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(firstName)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            contacts.remove(indexToRemove);
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    public void addMultipleContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of contacts to add: ");
        int numContacts = scanner.nextInt();

        for (int i = 0; i < numContacts; i++) {
            System.out.println("Enter details for contact #" + (i + 1) + ":");
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
            addContact(newContact);
        }
        System.out.println("Contacts added successfully");
    }

}
