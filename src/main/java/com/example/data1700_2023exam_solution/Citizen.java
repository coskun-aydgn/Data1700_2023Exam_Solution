package com.example.data1700_2023exam_solution;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Citizen {

    private Integer CID;
    private String firstName;
    private String surname;
    private String doB;
    private String SSN;
    private String phoneNr;
    private String email, city, street;

    public Citizen(Integer CID, String street, String city, String email,
                   String phoneNr, String SSN, String doB, String surname,
                   String firstName) {
        this.CID = CID;
        this.street = street;
        this.city = city;
        this.email = email;
        this.phoneNr = phoneNr;
        this.SSN = SSN;
        this.doB = doB;
        this.surname = surname;
        this.firstName = firstName;
    }
    public Citizen() {}

    public Integer getCID() {
        return CID;
    }

    public void setCID(Integer CID) {
        this.CID = CID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
