package course.lesson5.task1.vehicles;

import course.lesson5.task1.details.Engine;
import course.lesson5.task1.professions.Driver;

public class Car {
    String brand;
    String carClass;
    double weightCar;
    Engine engine;
    Driver driver;

    public Car(String brand, String carClass, double weightCar, Engine engine, Driver driver) {
        this.brand = brand;
        this.carClass = carClass;
        this.weightCar = weightCar;
        this.engine = engine;
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeightCar() {
        return weightCar;
    }

    public void setWeightCar(double weightCar) {
        this.weightCar = weightCar;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weightCar=" + weightCar +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

}
