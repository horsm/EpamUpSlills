package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task4;

//  4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//  Создайте данные в массив из пяти элементов типа Train,
//  добавьте возможность сортировки элементов массива по номерам поездов.
//  добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//  Добавьте возможность сортировки массив по пункту назначения,
//  причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) throws ParseException {

        Train[] trains = new Train[5];
        trains[0] = new Train("Витебск", 26, simpleDateFormat.parse("18:45"));
        trains[1] = new Train("Москва", 45, simpleDateFormat.parse("09:15"));
        trains[2] = new Train("Санкт-Петербург", 65, simpleDateFormat.parse("22:10"));
        trains[3] = new Train("Брест", 23, simpleDateFormat.parse("07:30"));
        trains[4] = new Train("Витебск", 56, simpleDateFormat.parse("15:40"));

        // сортировки по номерам поездов
        System.out.println("---Cортировки по номерам поездов---");
        sortByTrainNumber(trains);

        for (Train train : trains) {
            System.out.println("Поезд № " + train.getTrainNumber() + ". Название пункта назначения: " + train.getDestination() +
                    ", время отправления: " + simpleDateFormat.format(train.getDepartureTime()));
        }

        System.out.println();

        // вывод информации о поезде
        System.out.println("---Вывод информации о поезде---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер поезда: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите номер поезда: ");
            sc.next();
        }
        int zapros = sc.nextInt();

        if (printTrainInformation(trains, zapros) == null) {
            System.out.println("Нет такого поезда!");
        } else {
            System.out.println("Поезд № " + zapros);
            System.out.println(printTrainInformation(trains, zapros) + "\n");
        }

        System.out.println();

        // сортировка по пункту назначения
        System.out.println("---Сортировка по пункту назначения---");
        sortTrainDestination(trains);
        for (Train train : trains) {
            System.out.println("Поезд № " + train.getTrainNumber() + ". Название пункта назначения: " + train.getDestination() +
                    ", время отправления: " + simpleDateFormat.format(train.getDepartureTime()));
        }
    }

    private static void sortByTrainNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].getTrainNumber() > trains[j].getTrainNumber()) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    private static String printTrainInformation(Train[] trains, int trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                return "название пункта назначения: " + train.getDestination() +
                        ", время отправления: " + simpleDateFormat.format(train.getDepartureTime());
            }
        }
        return null;
    }

    private static void sortTrainDestination(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].getDestination().compareTo(trains[j].getDestination());
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (compare == 0) {
                    if (trains[i].getDepartureTime().compareTo(trains[j].getDepartureTime()) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }
}
