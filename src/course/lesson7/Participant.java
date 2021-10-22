package course.lesson7;

public abstract class Participant {
    protected double maxJumpHeight;
    protected double maxDistance;
    protected String name;

    public Participant(double maxJumpHeight, double maxDistance) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxDistance = maxDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public String getName() {
        return name;
    }

    abstract void run();
    abstract void jump();
}
