package com.upskill.basics.java.basics.linear;

public class Task5Seconds {
    public static void main(String[] args) {
        int x = 3752;

        int h = x / 3600;
        int m = (x - h * 3600) / 60;
        int sec = (x - h * 3600) - (m * 60);

        System.out.printf("%dч %dмин %dс", h, m, sec);
    }
}
