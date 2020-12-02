package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task5;

// 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
// свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.

public class Counter {

    private int currentValue;
    private int minValue;
    private int maxValue;

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    Counter() {
        this.currentValue = 0;
        this.minValue = 0;
        this.maxValue = 100;
    }

    Counter(int currentValue, int minValue, int maxValue) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int getCurrentValue() {
        return this.currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    int increaseByOne() {
        currentValue++;
        return currentValue;
    }

    int decreaseByOne() {
        currentValue--;
        return currentValue;
    }
}
