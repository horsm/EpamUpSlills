package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task2;

public class Test2 {
    private int first;
    private int second;

    Test2() {
        this.first = 1;
        this.second = 2;
    }

    Test2(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
