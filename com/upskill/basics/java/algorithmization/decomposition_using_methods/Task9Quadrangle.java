package com.upskill.basics.java.algorithmization.decomposition_using_methods;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task9Quadrangle {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double z = 5;
        double t = 6;

        System.out.println(quadrangleArea(x,y,z,t));
    }

    private static double quadrangleArea(double x, double y, double z, double t) {
        double s1 = x * y / 2;
        double xy = Math.sqrt(x * x + y * y);
        double pp = (z + t + xy) / 2;
        double s2 = Math.sqrt(pp*(pp-z)*(pp-t)*(pp-xy));
        return s1 + s2;
    }
}
