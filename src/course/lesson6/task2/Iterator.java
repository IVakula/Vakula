package course.lesson6.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class Iterator {
    ArrayList<Integer> arrayNumbers;
    int currentIndex;

    public Iterator(int[][] arr) {
        currentIndex = 0;
        arrayNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrayNumbers.add(arr[i][j]);
            }
        }
        arrayNumbers.sort(Integer::compareTo);
    }

    public boolean hasNext() {
        return currentIndex < arrayNumbers.size();
    }

    public int next() {
        return arrayNumbers.get(currentIndex++);
    }
}
