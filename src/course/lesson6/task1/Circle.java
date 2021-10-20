package course.lesson6.task1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        return Math.PI * radius * radius;
    }
}
