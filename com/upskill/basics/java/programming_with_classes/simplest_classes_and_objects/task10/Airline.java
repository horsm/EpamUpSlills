package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task10;

/*
10. Создать класс Airline, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    private String destination;
    private String flightNumber;
    private String planeType;
    private Date departureTime;
    private DayOfWeek [] dayOfWeek;

    static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    Airline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek [] dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (DayOfWeek day : dayOfWeek) {
            strBuilder.append(day);
            strBuilder.append(", ");
        }
        return String.format("Пункт назначения: %s, Номер рейса #: %s, Тип самолета: %s, Время вылета: %s, Дни недели: %s\b\b.",
                destination, flightNumber, planeType, ft.format(departureTime), strBuilder.toString());
    }

    String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
