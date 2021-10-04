package course.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main (String [] args){
        System.out.println("Введите движения робота");
        Scanner scannerJewels = new Scanner(System.in);
        String moves = scannerJewels.nextLine();
        Task2 task2 = new Task2();
        System.out.println(task2.judgeCircle(moves));
    }

    public boolean judgeCircle (String moves) {
        Boolean result = false;
        char[] chArrayMoves = moves.toCharArray();
        int coordinateX = 0;
        int coordinateY = 0;
        for (int i = 0; i < chArrayMoves.length; i++) {
            if (chArrayMoves[i] == 'R') {
                coordinateX++;
            } else if (chArrayMoves[i] == 'L') {
                coordinateX--;
            } else if (chArrayMoves[i] == 'U') {
                coordinateY++;
            } else if (chArrayMoves[i] == 'D') {
                coordinateY--;
            }
        }
        if (coordinateX == 0 && coordinateY == 0) {
            result = true;
        }
        return result;
    }
}
