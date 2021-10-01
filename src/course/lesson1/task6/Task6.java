package course.lesson1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(test());

    }

    static Boolean test() {
        Boolean result = false;
        char[][] mas = new char[][]{{'a', 's', 'd', 't', 'q'}, {'t', 'e', 's', 't', 'h'}, {'a', 'h', 'a', 'i', 'r'}};
        String a = "";
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                a += mas[i][j];
            }
            a += " ";
        }
        for (int j = 0; j <= 4; j++) {
            for (int i = 0; i <= 2; i++) {
                a += mas[i][j];
            }
            a += " ";
        }
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        if (a.contains(b)) {
            result = true;
        }
        return result;
    }
}
