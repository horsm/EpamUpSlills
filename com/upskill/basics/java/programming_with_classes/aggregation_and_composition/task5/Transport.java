package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task5;

public enum Transport {
    PLANE,
    BUS,
    TRAIN,
    SHIP,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}