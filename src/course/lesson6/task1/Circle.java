package course.lesson6.task1;

public class Circle implements Shape {
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        return Math.PI * radius * radius;
    }
}
