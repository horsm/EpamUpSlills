package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task3;

public class Student {
    private String surname;
    private int groupNumber;
    private int[] performance;

    Student (String surname, int groupNumber, int[] performance){
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.performance = performance;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }
}
