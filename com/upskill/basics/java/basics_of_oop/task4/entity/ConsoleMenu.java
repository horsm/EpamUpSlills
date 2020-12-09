package com.upskill.basics.java.basics_of_oop.task4.entity;

import com.upskill.basics.java.basics_of_oop.task4.action.ConsoleMenuAction;

public class ConsoleMenu {
    private ConsoleMenuAction consoleMenuAction = new ConsoleMenuAction();

    public void startConsoleMenu(){
        int choice;
        boolean isStopped = false;
        consoleMenuAction.printOptions();
        while (!isStopped) {
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = consoleMenuAction.makeChoice();
            isStopped = consoleMenuAction.processingOperation(choice);
        }
    }
}
