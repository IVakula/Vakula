package course.lesson3.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scannerWordFirst = new Scanner(System.in);
        String wordFirst = scannerWordFirst.nextLine();
        System.out.println("Введите строку,с которой сравниваете:");
        Scanner scannerWordSecond = new Scanner(System.in);
        String wordSecond = scannerWordSecond.nextLine();
        Task4 task4 = new Task4();
        System.out.println(task4.permutationCheck(wordFirst, wordSecond));
    }

    public Boolean permutationCheck(String wordFirst, String wordSecond) {

        while (wordFirst.length() > 0) {
            if (wordSecond.contains(String.valueOf(wordFirst.charAt(0)))) {
                wordSecond = wordSecond.replace(String.valueOf(wordFirst.charAt(0)), "");
                wordFirst = wordFirst.replace(String.valueOf(wordFirst.charAt(0)), "");
            } else {
                return false;
            }
        }
        return  wordSecond.isEmpty() && wordFirst.isEmpty();
    }
}
