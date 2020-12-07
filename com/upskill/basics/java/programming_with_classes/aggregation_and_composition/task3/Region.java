package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task3;

import java.util.ArrayList;

public class Region {
    private String regionalName;
    private City regionalCenter;
    private int area;
    private ArrayList<District> districts;

    Region(String regionalName, City regionalCenter, int area) {
        this.regionalName = regionalName;
        this.regionalCenter = regionalCenter;
        this.area = area;
        this.districts = new ArrayList<>();
    }

    double getArea() {
        return area;
    }

    City getRegionalCenter() {
        return regionalCenter;
    }

    ArrayList<District> getDistricts() {
        return districts;
    }
}
