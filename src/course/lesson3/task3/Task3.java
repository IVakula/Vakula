package course.lesson3.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner stringScanner = new Scanner(System.in);
        String inputString = stringScanner.nextLine();
        char[] inputArray = inputString.toCharArray();
        Task3 tasks = new Task3();
        tasks.permute(inputArray, 0);
    }

    private void permute(char[] arr, int index) {
        if (index >= arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++) {
            char t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;

            permute(arr, index + 1);

            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }
}
