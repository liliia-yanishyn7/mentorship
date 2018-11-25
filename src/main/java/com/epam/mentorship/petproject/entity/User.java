package com.epam.mentorship.petproject.entity;

import cucumber.api.java.eo.Se;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

@ToString
@EqualsAndHashCode
public class User {

    private static final AtomicInteger count = new AtomicInteger(0);
    @Setter
    private int userID = count.getAndIncrement();
    private String userName;
    private String email;
    private Address userAddress;

    public User(String userName, String email, Address userAddress) {
        this.userName = userName;
        this.email = email;
        this.userAddress = userAddress;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }
}
