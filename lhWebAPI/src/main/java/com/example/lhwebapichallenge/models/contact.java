package com.example.lhwebapichallenge.models;

import java.util.List;

public class contact {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;

    private List<skill> skills;

    public contact(){
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<skill> getSkills() {
        return skills;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFullName(String name) {
        String[] ns = name.split(" ", 2);
        if(ns.length < 2) {
            this.firstName = ns[0];
            return;
        }
        this.firstName = ns[0];
        this.lastName = ns[1];
    }

    public void setSkills(List<skill> skills) {
        this.skills = skills;
    }

}
