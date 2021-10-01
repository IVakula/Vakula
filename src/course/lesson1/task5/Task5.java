package course.lesson1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(space());

    }

    static String space() {
        String a = "";
        System.out.println("Введите строку!");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine().trim().replaceAll("[\\s]{2,}", " ");

        return a;
    }
}
