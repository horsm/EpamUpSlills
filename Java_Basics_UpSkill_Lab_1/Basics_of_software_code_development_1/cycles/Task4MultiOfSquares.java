package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.cycles;

import java.math.BigDecimal;
import java.math.BigInteger;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4MultiOfSquares {
    public static void main(String[] args) {
        int N = 200;

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            result = result.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(result.toString());
    }
}
