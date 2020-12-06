package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String modelName;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private boolean isFuel;

    Car(String modelName) {
        this.modelName = modelName;
        this.wheels = new ArrayList<>(4);
        this.isFuel = true;
    }

    void setEngine(Engine engine) {
        this.engine = engine;
    }

    ArrayList<Wheel> getWheels() {
        return wheels;
    }

    void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.wheels = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
    }

    String getModelName() {
        return modelName;
    }

    void changeWheel() {
        for (int i = 0; i < 4; i++) {
            if (!wheels.get(i).isGood()) {
                System.out.printf("Колесо № %d заменено\n", i + 1);
                int wheelDia = this.getWheels().get(i).getDiameter();
                this.getWheels().set(i, new Wheel(wheelDia));
            }
        }
    }

    void setFuel(boolean fuel) {
        this.isFuel = fuel;
    }

    void refuel() {
        this.isFuel = true;
        System.out.println("Машина заправлена.");
    }


    void run() {
        int wheelCounter = 0;
        String message = "";
        boolean isEngine = false;

        for (Wheel wheel : wheels) {
            if (wheel != null) {
                wheelCounter++;
            }
        }
        if (wheelCounter == 0) {
            message = "- колеса не установлены. Установите 4 колеса. \n";
        } else if (wheelCounter == 1) {
            message = "- 1 колесо установлено. Установите 3 колеса. \n";
        } else if (wheelCounter == 2 || wheelCounter == 3) {
            message = String.format("- только %d колеса установлено. Установите %d колес\n", wheelCounter, 4 - wheelCounter);
        }
        System.out.print(message);

        if (engine == null) {
            System.out.println("- двигатель не установлен. Установите двигатель.");
        } else {
            isEngine = true;
        }

        if (isEngine && wheelCounter == 4) {
            boolean ready = true;
            for (int i = 0; i < 4; i++) {
                if (!wheels.get(i).isGood()) {
                    System.out.printf("- колесо %d пробито. Замените колесо %n", i + 1);
                    ready = false;
                }
            }
            if (!isFuel) {
                System.out.println("- Пустой. Необходима заправка");
            } else if (ready) {
                System.out.println("- Заправлен.");
            }
        }

    }
}
