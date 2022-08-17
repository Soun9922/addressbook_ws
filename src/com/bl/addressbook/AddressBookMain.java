package com.bl.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, i = 0;
        final AddressBook addressBook = new AddressBook();
        while (i == 0) {
            System.out.println("----Welcome to Address Book Management----");
            System.out.println("\t--Menu--");
            System.out.println("1. Add New Person Details");
            System.out.println("2. Display Records");
            System.out.println("3. Edit Person");
            System.out.println("4. Delete Person");
            System.out.println("5. Exit");
            System.out.println("\t-----xx-----");
            System.out.println("--Enter Your Choice--");
            choice = (int) InputUtil.getIntValue();
            switch (choice) {
                case 1:
                    addressBook.addPerson();
                    break;
                case 2:
                    addressBook.displayRecord();
                    break;
                case 3:
                    addressBook.editRecord();
                    break;
                case 4:
                    addressBook.deleteRecord(scanner);
                case 5:
                    i = 1;
                default:
                    System.out.println("!!!-- Please Enter Valid Input --!!!");
            }
        }
    }
}
