package course.lesson6.task1;

public class Square implements Shape {

    Double width = null;
    Double length = null;

    public Square(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double shapeArea() {
        return width * length;
    }
}
