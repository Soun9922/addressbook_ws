package com.bl.addressbook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Person> personList = new LinkedList<Person>();

    void addPerson(){
        int i = 0;
        String fName = null;
        final String lName, address, city, state;
        final long phoneNum, zip;
        while (i == 0){
            System.out.println("Enter First Name: ");
            fName = InputUtil.getStringValue();
            if (checkExist(fName)){
                System.out.println("! ! Person Already Exists ! !\nPlease enter different name...");
            } else {
                i = 1;
            }
        }
        System.out.println("Enter Last Name: ");
        lName = InputUtil.getStringValue();
        System.out.println("Enter Address: ");
        address = InputUtil.getStringValue();
        System.out.println("Enter City: ");
        city = InputUtil.getStringValue();
        System.out.println("Enter State: ");
        state = InputUtil.getStringValue();
        System.out.println("Enter Phone Number: ");
        phoneNum = InputUtil.getIntValue();
        System.out.println("Enter Zip Code: ");
        zip = InputUtil.getIntValue();
        personList.add(new Person(fName,lName,address,city,state,phoneNum,zip));
    }
    
    void editRecord(){
        int num, choice = 0, i = 0;
        String fName, lName, address, city, state;
        long phoneNum, zip;
        for (Person person: personList) {
            System.out.println("ID: #" + personList.indexOf(person) + " : " + person);
        }
        System.out.print("\nEnter #ID to edit Contact: ");
        num = (int) InputUtil.getIntValue();
        System.out.println(personList.get(num));
        while (i == 0) {
            System.out.println("""
                    What do you want to edit....
                    \t1. Address
                    \t2. City
                    \t3. State
                    \t4. Phone Number
                    \t5. Zip Code
                    \t6. Save & Exit
                    """);
            choice = (int) InputUtil.getIntValue();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter new Address: ");
                    address = InputUtil.getStringValue();
                    personList.get(num).setAddress(address);
                }
                case 2 -> {
                    System.out.print("Enter new City: ");
                    city = InputUtil.getStringValue();
                    personList.get(num).setCity(city);
                }
                case 3 -> {
                    System.out.print("Enter new State: ");
                    state = InputUtil.getStringValue();
                    personList.get(num).setState(state);
                }
                case 4 -> {
                    System.out.print("Enter new Phone Number: ");
                    phoneNum = InputUtil.getIntValue();
                    personList.get(num).setPhoneNum(phoneNum);
                }
                case 5 -> {
                    System.out.print("Enter new Zip Code: ");
                    zip = InputUtil.getIntValue();
                    personList.get(num).setZip(zip);
                }
                case 6 -> i = 1;
                default -> System.out.println("!!! Please Enter Valid Entry !!!");
            }
            System.out.println(personList.get(num));
        }
    }

    void  deleteRecord(Scanner scanner){
        System.out.println("Which contact you want to Delete? (Enter First Name)");
        String fName = scanner.nextLine();
        Person deletePerson = null;
        for (int i = 0; i < personList.size(); i++) {
            if (fName.equals(personList.get(i).getfName())){
                deletePerson = personList.remove(i);
            }
        }
        if (deletePerson == null){
            System.out.println("No Contact found with name" + fName + ".");
        } else {
            System.out.println(deletePerson.getfName() + "'s contact has been removed from your address book.");
        }

    }

    void displayRecord(){
        for (Person person: personList) {
            System.out.println(person);
        }
    }

    public boolean checkExist(String fName){
        int flag = 0;
        for (Person person: personList) {
            if (person.getfName().equals(fName)){
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            return true;
        }
        return false;
    }
}
