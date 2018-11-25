package com.epam.mentorship.petproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;


@ToString
@EqualsAndHashCode
public class Address {

    private static final AtomicInteger count = new AtomicInteger(0);
    @Setter
    private int addressID = count.getAndIncrement();
    private String country;
    private String city;
    private String street;
    private int buildingNumber;

    public Address(String country, String city, String street, int buildingNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public int getAddressID() {
        return addressID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
