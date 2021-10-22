package course.lesson7;

public class Human extends Participant{

    public Human(double maxJumpHeight, double maxDistance) {
        super(maxJumpHeight, maxDistance);
        this.name = "Человек";
    }

    @Override
    void run() {
        System.out.println("Человек бежит...");
    }

    @Override
    void jump() {
        System.out.println("Человек прыгает...");
    }
}
