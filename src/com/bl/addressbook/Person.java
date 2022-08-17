package com.bl.addressbook;

public class Person {
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String state;
    private long phoneNum;
    private long zip;

    public Person(String fName, String lName, String address, String city, String state, long phoneNum, long zip) {
    this.fName = fName;
    this.lName = lName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.phoneNum = phoneNum;
    this.zip = zip;
    }

    public Person() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
