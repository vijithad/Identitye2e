package com.identity.e2e.model;
// Vehicle object to hold vehicle information required for the test
public class Vehicle {

    private final String registration;
    private final String make;
    private final String color;

    public Vehicle(final String registration, final String make, final String color) {
        this.registration = registration;
        this.make = make;
        this.color = color;
    }

    public String getModel() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getRegistration() {
        return registration;
    }
}
