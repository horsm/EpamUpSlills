package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task3;

public class Main {
    public static void main(String[] args) {
        City minsk = new City("Минск");
        Country belarus = new Country("Беларусь", minsk);

        belarus.addRegion(new Region("Брестская область", new City("Брест"), 32_700));
        belarus.addRegion(new Region("Витебская область'", new City("Витебск"), 40_100));
        belarus.addRegion(new Region("Гомельская область", new City("Гомель"), 40_400));
        belarus.addRegion(new Region("Гродненская область", new City("Гродно"), 25_100));
        belarus.addRegion(new Region("Минская область", minsk, 40_200));
        belarus.addRegion(new Region("Могилевская область", new City("Могилев"), 29_100));

        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegioCenters();
    }
}
