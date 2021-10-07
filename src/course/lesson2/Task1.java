package course.lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите драгоценные камни");
        Scanner scannerJewels = new Scanner(System.in);
        String jewels = scannerJewels.nextLine();
        System.out.println("Введите камни");
        Scanner scannerStones = new Scanner(System.in);
        String stones = scannerStones.nextLine();
        Task1 task1 = new Task1();
        System.out.println(task1.numJewelsInStones(jewels, stones));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int numberJewels = 0;
        char[] chArrayJewels = stones.toCharArray();
        Boolean isContain = false;
        for (int i = 0; i < chArrayJewels.length; i++) {
            if (isContain = jewels.contains(String.valueOf(chArrayJewels[i]))) {
                numberJewels++;
            }
        }
        return numberJewels;
    }
}
