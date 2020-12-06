package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        FlightSchedule flightSchedule = new FlightSchedule("Варшава", new ArrayList<>());

        flightSchedule.addAirline("Минск", "123", "ИЛ 123",
                Airline.ft.parse("13:45"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Рига", "345", "ТУ 134",
                Airline.ft.parse("18:54"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Вильнюс", "375", "ТУ 134",
                Airline.ft.parse("11:55"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Минск", "456", "Боинг 748",
                Airline.ft.parse("12:00"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
                        DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY});
        flightSchedule.addAirline("Москва", "333", "Боинг 777",
                Airline.ft.parse("08:55"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Рига", "568", "ТУ 134",
                Airline.ft.parse("10:35"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Париж", "777", "ИЛ 123",
                Airline.ft.parse("11:40"), new DayOfWeek[]{DayOfWeek.WEDNESDAY});


        System.out.println("Самолеты на Минск:");
        ArrayList<Airline> airlinesToBrussels = flightSchedule.airlinesToDestination("Минск");
        for (Airline airline : airlinesToBrussels) {
            System.out.println(airline);
        }

        System.out.println("\nСамолеты, летящие в воскресенье:");
        ArrayList<Airline> airlinesOnSunday = flightSchedule.flightDays(DayOfWeek.SUNDAY);
        for (Airline airline : airlinesOnSunday) {
            System.out.println(airline);
        }

        System.out.println("\nСамолеты, вылетающие после 11:00 в пятницу:");
        Date time = Airline.ft.parse("11:00");
        ArrayList<Airline> airlinesOnTuesday = flightSchedule.flightDays(DayOfWeek.FRIDAY, time);
        for (Airline airline : airlinesOnTuesday) {
            System.out.println(airline);
        }
    }
}
