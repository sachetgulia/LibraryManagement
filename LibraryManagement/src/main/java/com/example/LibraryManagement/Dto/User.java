package com.example.LibraryManagement.Dto;

import java.util.List;

public class User {
    int id;
    String name;
    String phoneNo;
    String address;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String f_name) {
        this.name = f_name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public User(int id, String name, String phoneNo, String address) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }


}
