package course.lesson5.task1.vehicles;

import course.lesson5.task1.details.Engine;
import course.lesson5.task1.professions.Driver;

public class Lorry extends Car {
    int carrying;

    public Lorry(String brand, String carClass, double weightCar, Engine engine, Driver driver, int carrying) {
        super(brand, carClass, weightCar, engine, driver);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weightCar=" + weightCar +
                ", engine=" + engine +
                ", driver=" + driver +
                ", carrying=" + carrying +
                '}';
    }
}
