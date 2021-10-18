package course.lesson6.task1;

public class Triangle implements Shape {
    Double side = null;
    Double height = null;

    public Triangle(Double side, Double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double shapeArea() {
        return side * height / 2;
    }
}
