package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task3;

import java.util.ArrayList;

public class Country {
    private final String countryName;
    private final City capital;
    private final ArrayList<Region> regions;

    Country(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    void printNumberOfRegions() {
        System.out.printf("В стране %s %d областей.\n", countryName, this.regions.size());
    }

    void printCapital() {
        System.out.printf("Столица страны %s: %s.\n", countryName, capital);
    }

    void printArea() {
        int area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        System.out.printf("Площадь страны %s: %d км2.\n", countryName, area);
    }

    void printRegioCenters() {
        System.out.printf("Облатные центры %s: ", countryName);
        for (Region region : regions) {
            System.out.print(region.getRegionalCenter() + ", ");
        }
        System.out.println("\b\b.");
    }

    void addRegion(Region region) {
        regions.add(region);
    }
}
