package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.cycles;

import java.math.BigDecimal;

public class Task_4_multi_of_squares {
    public static void main(String[] args) {
        int N = 200;

        int[] array = new int[N];

        for (int i = 1, k = 0; i <= N; i++, k++) {
            array[k] = i * i;
        }

        BigDecimal result = BigDecimal.ONE;
        for (int i = 0; i < N; i++) {
            result = result.multiply(BigDecimal.valueOf(array[i]));
        }
        System.out.println(result);
    }
}
