package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task4;

//  4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
    private String destination;
    private int trainNumber;
    private Date departureTime;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    Train(String destination, int trainNumber, Date departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }
}
