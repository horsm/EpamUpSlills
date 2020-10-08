package Basics_of_software_code_development_1.Сycles;

public class Task_3_sum_of_squares {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i <100 ; i++) {
            count+= i*i;
        }

        System.out.println(count);
    }
}
