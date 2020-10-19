package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.cycles;

public class Task_5_ASCII {
    public static void main(String[] args) {
        char[] alphabetWithDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < alphabetWithDigits.length; i++) {
            System.out.println(alphabetWithDigits[i] + " - " + (int) alphabetWithDigits[i]);
        }
    }
}
