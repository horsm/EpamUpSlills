package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task3;

public class District {
    private final String districtName;
    private City districtCenter;
    private double area;

    public District(String districtName, City districtCenter, double area) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
        this.area = area;
    }

    String getDistrictName() {
        return districtName;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

}
