package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.branching;

public class Task3Point {
    public static void main(String[] args) {
        int x1 = -2;
        int y1 = 5;
        int x2 = 4;
        int y2 = 3;
        int x3 = 16;
        int y3 = -1;

        if (((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) == 0) {
            System.out.println("yes");
        } else System.out.println("no");


    }
}
