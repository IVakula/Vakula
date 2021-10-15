package course.lesson5.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите исходную строку:");
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        System.out.println("Итоговая строка: ");
        System.out.println(reverseOrder(stringInput));
    }

    static String reverseOrder(String stringInput) {
        String[] arrayStringInput = stringInput.split(" ");
        StringBuilder stringOutput = new StringBuilder();
        for (int i = arrayStringInput.length - 1; i >= 0; i--) {
            stringOutput.append(arrayStringInput[i]).append(" ");
        }
        return stringOutput.toString().trim();
    }
}
