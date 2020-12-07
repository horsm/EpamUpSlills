package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task5;

public enum TourPackageType {
    RECREATION,
    EXCURSION,
    TREATMENT,
    SHOPPING,
    CRUISE;


    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}