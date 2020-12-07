package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task5;

public enum TypeOfFood {
    NOT_INCLUDET,
    BREAKFAST,
    ALL_INCLUSIVE;


    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}