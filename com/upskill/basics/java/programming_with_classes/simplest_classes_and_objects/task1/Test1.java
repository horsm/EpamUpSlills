package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task1;

public class Test1 {
    private int first;
    private int second;

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

    public int findSum(int first, int second) {
        return this.first + this.second;
    }

    public int findMax(int first, int second) {
        return Math.max(this.first, this.second);
    }

}
