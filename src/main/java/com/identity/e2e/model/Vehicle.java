package com.identity.e2e.model;

public class Vehicle {

    private final String registration;
    private final String make;
    private final String model;

    public Vehicle(final String registration, final String make, final String model) {
        this.registration = registration;
        this.make = make;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getRegistration() {
        return registration;
    }
}
