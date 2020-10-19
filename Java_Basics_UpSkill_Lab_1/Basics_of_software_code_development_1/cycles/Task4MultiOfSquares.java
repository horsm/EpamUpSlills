package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.cycles;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task4MultiOfSquares {
    public static void main(String[] args) {
        int n = 200;

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(result.toString());
    }
}
