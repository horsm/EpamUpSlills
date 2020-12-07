package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task3;

public class City {
    private String name;

    City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
