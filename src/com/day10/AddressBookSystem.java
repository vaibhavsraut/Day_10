package com.day10;

import java.util.ArrayList;
import java.util.List;

public class AddressBookSystem {
    private List<AddressBook> addressBooks;

    public AddressBookSystem() {
        this.addressBooks = new ArrayList<>();
    }

    public void addAddressBook(String name) {
        AddressBook addressBook = new AddressBook();
        addressBooks.add(addressBook);
        System.out.println("Address Book '" + name + "' added successfully");
    }
}
