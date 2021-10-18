package course.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(12.5, 15.0),
                new Circle(19.1),
                new Triangle(17.14, 12.5),
                new Circle(13.2),
                new Triangle(14.6, 12.5)};
        System.out.println("Массив фигур:");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName()+" площадь = "+shape.shapeArea());
        }
        System.out.println("Площадь всех фигур равна: " + sumAreasOfShapes(shapes));
    }

    static double sumAreasOfShapes(Shape[] shapes) {
        double sumAreasOfShape = 0.0;
        for (Shape shape : shapes) {
            sumAreasOfShape += shape.shapeArea();
        }
        return sumAreasOfShape;
    }
}
