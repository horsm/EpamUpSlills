package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task5;

public class Client {
    private String firstName;
    private String lastName;
    private double prepay;
    private TourPackage tourPackage;

    Client(String firstName, String lastName, double prepay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.prepay = prepay;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }
}
