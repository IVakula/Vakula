package course.lesson7;

public class Robot extends Participant{
    public Robot(double maxJumpHeight, double maxDistance) {
        super(maxJumpHeight, maxDistance);
        this.name = "Робот";
    }

    @Override
    void run() {
        System.out.println("Робот бежит...");
    }

    @Override
    void jump() {
        System.out.println("Робот прыгает...");
    }
}
