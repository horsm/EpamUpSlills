package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.Linear;

public class Task5Seconds {
    public static void main(String[] args) {
        int x = 3752;

        int h = x / 3600;
        int m = (x - h * 3600) / 60;
        int sec = (x - h * 3600) - (m * 60);

        System.out.printf("%dч %dмин %dс", h, m, sec);
    }
}
