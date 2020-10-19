package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.cycles;

public class Task3SumOfSquares {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100 ; i++) {
            count+= i*i;
        }

        System.out.println(count);
    }
}
