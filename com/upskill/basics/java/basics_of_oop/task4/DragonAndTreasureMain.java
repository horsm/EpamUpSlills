package com.upskill.basics.java.basics_of_oop.task4;

import com.upskill.basics.java.basics_of_oop.task4.entity.Cave;
import com.upskill.basics.java.basics_of_oop.task4.entity.ConsoleMenu;

public class DragonAndTreasureMain {
    public static Cave snakeGorynychcave = new Cave("Snake Gorynych");

    public static void main(String[] args) {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        snakeGorynychcave.setNumberOfTreasure(100);
        consoleMenu.startConsoleMenu();
    }
}
