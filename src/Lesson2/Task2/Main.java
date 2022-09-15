package Lesson2.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 2, 7};
        final int SUM = 10;
        int j = 0;
        for (int i = 0; i < array.length; ) {
            if (array[i] + array[j] == SUM) {
                System.out.println(Arrays.toString(array) + ", " + SUM + " -> [" + array[i] + ", " + array[j] + "]");
                return;
            }
            if (j == array.length - 1) {
                i++;
                j = 0;
            } else {
                j++;
            }
        }
        System.out.println("Bad values");
    }
}