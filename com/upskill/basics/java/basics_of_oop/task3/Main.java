package com.upskill.basics.java.basics_of_oop.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int year = 2020;
        Calendar calendar = new Calendar(year);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        calendar.addHoliday(LocalDate.parse("01.01." + year, dtf), "New Year");
        calendar.addHoliday(LocalDate.parse("07.01." + year, dtf), "Orthodox Christmas");
        calendar.addHoliday(LocalDate.parse("08.03." + year, dtf), "Women’s Day");
        calendar.addHoliday(LocalDate.parse("01.05." + year, dtf), "Labour Day");
        calendar.addHoliday(LocalDate.parse("09.05." + year, dtf), "Victory Day");
        calendar.addHoliday(LocalDate.parse("03.07." + year, dtf), "Independence Day");
        calendar.addHoliday(LocalDate.parse("07.11." + year, dtf), "October Revolution Day");
        calendar.addHoliday(LocalDate.parse("25.12." + year, dtf), "Catholic Christmas");

        calendar.printHolidays();

        Calendar.Holiday holiday = calendar.removeHoliday("October Revolution Day");
        System.out.println("\nremoved holiday " + holiday);
    }
}
