package course.lesson6.task1;

public class Square implements Shape {
    private double width;
    private double length;

    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double shapeArea() {
        return width * length;
    }
}
