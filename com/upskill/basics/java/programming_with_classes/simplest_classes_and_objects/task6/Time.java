package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task6;

/*
6. Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    private Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    private void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    private void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    private void setSecond(int second) {
        if (second > 59 || second < 0) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    private String getTime() {
        return String.format("%d:%d:%d", hour, minute, second);
    }

    public static void main(String[] args) {

        Time time = new Time(11, 53, 28);
        System.out.println("Текущее время: " + time.getTime());

        System.out.print("Установка часа как 12: ");
        time.setHour(12);
        System.out.println(time.getTime());

        System.out.print("Установка минут как 33: ");
        time.setMinute(33);
        System.out.println(time.getTime());

        System.out.print("Установка секунд как 43: ");
        time.setSecond(43);
        System.out.println(time.getTime());

        System.out.print("Установка часа как 33: ");
        time.setHour(33);
        System.out.println(time.getTime());

        System.out.print("Установка минут как 67: ");
        time.setMinute(67);
        System.out.println(time.getTime());

        System.out.print("Установка секунд как 90: ");
        time.setSecond(90);
        System.out.println(time.getTime());
    }
}

