package course.lesson4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите массив целых чисел");
        Scanner scannerInput = new Scanner(System.in);
        ArrayList<Integer> inputArrayList = new ArrayList<>();
        inputArrayList.add(scannerInput.nextInt());
        System.in.close();
        while (scannerInput.hasNextInt()) {
            inputArrayList.add(scannerInput.nextInt());
        }
        int[] inputArrayInt = new int[inputArrayList.size()];
        for (int i = 0; i < inputArrayList.size(); i++) {
            inputArrayInt[i] = inputArrayList.get(i);
        }
        int[] result = sortArrayByParity(inputArrayInt);
        System.out.println("Отсортироанный миссив: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static int[] sortArrayByParity(int[] arrayNumbers) {
        int indexEven = 0;
        int indexOdd = arrayNumbers.length - 1;
        int[] arrayOutPut = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                arrayOutPut[indexEven] = arrayNumbers[i];
                indexEven++;
            } else {
                arrayOutPut[indexOdd] = arrayNumbers[i];
                indexOdd--;
            }
        }
        return arrayOutPut;
    }
}
