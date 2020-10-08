package Basics_of_software_code_development_1.Linear;

public class Task_6_Area {
    public static void main(String[] args) {
        double x = 1;
        double y = 1;

        boolean result = (((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) || ((x >= -4 && x <= 4) && (y <= 0 && y >= -4))) ?
                true : false;

        System.out.println(result);
    }


}
