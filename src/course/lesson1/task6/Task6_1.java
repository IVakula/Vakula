package course.lesson1.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(test());
    }

    static Boolean test() throws FileNotFoundException {
        Boolean check = false;
        File file = new File("/home/ivakula/MyProjects/Course/src/course/lesson1/task6/Text.txt");
        Scanner sc = new Scanner(file);
        String str = sc.nextLine().trim().replaceAll("\\s+", "");
        int i = str.length();
        String[] mas = new String[i];
        for (int j = 0; j < i; j++) {
            mas[j] = String.valueOf(str.charAt(j));
        }
        String res = str + " ";
        while (sc.hasNextLine()) {
            str = sc.nextLine().trim().replaceAll("\\s+", "");
            for (int j = 0; j < i; j++) {
                mas[j] = mas[j] + String.valueOf(str.charAt(j));
            }
            res += str + " ";
        }
        Scanner sc2 = new Scanner(System.in);
        String word = sc2.nextLine();

        if (res.contains(word)) {
            check = true;
        }
        for (int j = 0; j < i; j++) {
            if (mas[j].contains(word)) {
                check = true;
            }
        }
        return check;
    }
}
