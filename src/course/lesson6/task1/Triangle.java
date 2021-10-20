package course.lesson6.task1;

public class Triangle implements Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double shapeArea() {
        return side * height / 2;
    }
}
