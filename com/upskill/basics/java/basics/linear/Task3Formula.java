package com.upskill.basics.java.basics.linear;

public class Task3Formula {
    public static void main(String[] args) {
        double x = 40;
        double y = 50;

        System.out.println((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * (Math.tan(x*y)));
    }
}
