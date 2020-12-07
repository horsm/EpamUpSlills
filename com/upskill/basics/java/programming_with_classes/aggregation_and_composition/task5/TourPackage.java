package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task5;

public class TourPackage {
    private String country;
    private String city;
    private TourPackageType type;
    private Transport transport;
    private TypeOfFood food;
    private int numberOfDays;
    private double price;

    public TourPackage(String country, String city, TourPackageType type, Transport transport, TypeOfFood food, int numberOfDays, double price) {
        this.country = country;
        this.city = city;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public TourPackageType getType() {
        return type;
    }

    public void setType(TourPackageType type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public TypeOfFood getFood() {
        return food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getPrice() {
        return price;
    }
}
