package com.upskill.basics.java.basics_of_oop.task5;

import com.upskill.basics.java.basics_of_oop.task5.action.CustomerAction;

public class PresentRunner {
    public static void main(String[] args) {
        CustomerAction customerAction = new CustomerAction();
        customerAction.run();
    }
}
