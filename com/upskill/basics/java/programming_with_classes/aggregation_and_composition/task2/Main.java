package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task2;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) {
        Car vaz = new Car("ВАЗ 21074");

        System.out.printf("Машина создана: %s.\n", vaz.getModelName());
        vaz.run();

        Engine engine = new Engine(81, 1.5);
        vaz.setEngine(engine);
        System.out.printf("\n Мощность %d л.с. установлена. Объем %.1f литров.\n",
                engine.getPower(), engine.getVolume());
        vaz.run();

        int whellDiameter = 19;
        vaz.setWheels(new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter));
        System.out.print("\nКолеса установлены\n");
        vaz.run();

        vaz.getWheels().get(2).breakWheel();
        System.out.println("\nПоломка.");
        vaz.run();

        vaz.changeWheel();
        System.out.println("\nКолесо заменено\n");
        vaz.run();

        System.out.println("\nТопливо закончилось\n");
        vaz.setFuel(false);
        vaz.run();
        vaz.refuel();
        vaz.run();

        System.out.println("\nМодель машины: " + vaz.getModelName());
    }
}
