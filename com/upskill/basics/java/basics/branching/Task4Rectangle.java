package com.upskill.basics.java.basics.branching;



public class Task4Rectangle {
    public static void main(String[] args) {
        // размер кирпича
        int x = 3;
        int y = 8;
        int z = 4;
        // размер отверстия
        int a = 4;
        int b = 3;

        if (((x <= a) && (y <= b)) || ((x <= b) && (y <= a))) {
            System.out.println("true");
        } else if (((x <= a) && (z <= b)) || ((z <= a) && (x <= b))) {
            System.out.println("true");
        } else if (((y <= a) && (z <= b)) || ((z <= a) && (y <= b))) {
            System.out.println("true");
        } else
            System.out.println("false");

    }
}
