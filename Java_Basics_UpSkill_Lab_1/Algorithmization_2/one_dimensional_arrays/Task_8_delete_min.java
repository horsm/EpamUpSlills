package Java_Basics_UpSkill_Lab_1.Algorithmization_2.one_dimensional_arrays;

import java.util.Arrays;

public class Task_8_delete_min {
    public static void main(String[] args) {

        double[] array = {0, 2, 3, 0, 1, 0, 7, 8, 1};

        System.out.println("Первичный массив:");
        System.out.println(Arrays.toString(array));

        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (min == array[i]) {
                count++;
            }
        }
        System.out.println("count  = " + count);

        int nElems = array.length;
        System.out.println("min = " + min);
        int i;
        for (i = 0; i < array.length; i++)
            if (array[i] == min) {
                for (int k = i; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
            }
        nElems = nElems - count;    //уменьшение размера

        System.out.println("Вторичный массив:");
        for (int j = 0; j < nElems; j++)         //вывод элементов
            System.out.print(array[j] + " ");
        System.out.println("");


    }
}
