package course.lesson7;

public class Cat extends Participant {

    public Cat(double maxJumpHeight, double maxDistance) {
        super(maxJumpHeight, maxDistance);
        this.name = "Кот";
    }

    @Override
    void run() {
        System.out.println("Кот бежит...");
    }

    @Override
    void jump() {
        System.out.println("Кот прыгает...");
    }
}
