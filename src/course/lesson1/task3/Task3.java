package course.lesson1.task3;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int a = 10;
        int b = 20;
        System.out.println("Массив целых чисел:");
        for (int i = 0; i < 10; i++) {
            myArray[i] = a + (int) (Math.random() * ((b - a) + 1));
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + myArray[i];
        }
        double avg = sum / 10d;
        System.out.println("Среднее арифметическое равно: " + avg);

    }
}
