package Lesson1.Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        Random random = new Random();

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (var arr : array) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(100) + 1;
                sum += arr[j];
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
            }
        }

        System.out.println("Максимальное: " + max + "\nМинимальное: " + min + "\nСреднее арифметическое: " + ((double)sum / (array.length * array[0].length)));

    }


}


