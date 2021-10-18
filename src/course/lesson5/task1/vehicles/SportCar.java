package course.lesson5.task1.vehicles;

import course.lesson5.task1.details.Engine;
import course.lesson5.task1.professions.Driver;

public class SportCar extends Car {
    double speed;

    public SportCar(String brand, String carClass, double weightCar, Engine engine, Driver driver, double speed) {
        super(brand, carClass, weightCar, engine, driver);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weightCar=" + weightCar +
                ", engine=" + engine +
                ", driver=" + driver +
                ", speed=" + speed +
                '}';
    }
}
