package course.lesson3.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Введите минимальное значение массива");
        Scanner number1 = new Scanner(System.in);
        int numberMin = number1.nextInt();
        System.out.println("Введите максимальное значение массива");
        Scanner number2 = new Scanner(System.in);
        int numberMax = number2.nextInt();
        System.out.println("Введите количество элементов массива");
        Scanner number3 = new Scanner(System.in);
        int numberElementsArray = number3.nextInt();

        int[] inputArray = new int[numberElementsArray];
        Random randomNumber = new Random();
        for (int i = 0; i < inputArray.length; i++) {
            do {
                inputArray[i] = randomNumber.nextInt(numberMax - numberMin) + numberMin;
            }
            while (inputArray[i] == 0);
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

        Task2 task2 = new Task2();
        long[] resultArray = task2.sortArraySquaresNumbers(inputArray);
        System.out.println();
        System.out.println("Результирующий массив:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    public long[] sortArraySquaresNumbers(int[] inputArray) {

        long[] arraySquaresNumbers = new long[inputArray.length];
        for (int i = 0; i < arraySquaresNumbers.length; i++) {
            arraySquaresNumbers[i] = (long) Math.pow(inputArray[i], 2);
        }
        Arrays.sort(arraySquaresNumbers);
        return arraySquaresNumbers;
    }

}
