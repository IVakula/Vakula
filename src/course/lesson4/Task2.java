package course.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[][] inputArray = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        Task2 task2 = new Task2();
        System.out.println("Периметр равен:  " + task2.islandPerimeter(inputArray));
    }

    public int islandPerimeter(int[][] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return 0;
        }
        int perimeter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++) {
                if (inputArray[i][j] == 1) {
                    perimeter += 4;
                    if (i > 0 && inputArray[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if (j > 0 && inputArray[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }


}
