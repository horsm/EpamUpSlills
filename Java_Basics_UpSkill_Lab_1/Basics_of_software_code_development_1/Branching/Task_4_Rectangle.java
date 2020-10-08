package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.Branching;

public class Task_4_Rectangle {
    public static void main(String[] args) {
        // размер кирпича
        int x = 3;
        int y = 3;
        int z = 3;
        // размер отверстия
        int a = 4;
        int b = 2;

        if (((x <= a) && (y <= b)) || ((x <= b) && (y <= a))) {
            System.out.println("true");
        } else if (((x <= a) && (z <= b)) || ((z <= b) && (x <= a))) {
            System.out.println("true");
        } else if (((y <= a) && (z <= b)) || ((z <= b) && (y <= a))) {
            System.out.println("true");
        } else
            System.out.println("false");


    }
}
