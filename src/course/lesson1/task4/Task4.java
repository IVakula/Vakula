package course.lesson1.task4;

public class Task4 {
    public static void main(String[] arg) {
        System.out.println(withdraw());

    }

    public static String withdraw() {
        String a = "";
        for (int i = 1; i <= 30; i++) {
            a += "(" + i + ")";
        }
        return a;
    }
}
