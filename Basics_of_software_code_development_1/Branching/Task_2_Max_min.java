package Basics_of_software_code_development_1.Branching;

public class Task_2_Max_min {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 4;
        int d = 6;

        System.out.println(maxCh(minCh(a, b), minCh(c, d)));
    }

    private static int minCh(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    private static int maxCh(int a, int b) {
        if (a > b) return a;
        else return b;
    }
}
