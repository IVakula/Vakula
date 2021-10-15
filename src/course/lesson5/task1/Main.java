package course.lesson5.task1;

import course.lesson5.task1.details.Engine;
import course.lesson5.task1.professions.Driver;
import course.lesson5.task1.vehicles.Lorry;
import course.lesson5.task1.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Audi",
                "Business",
                125.2,
                new Engine(150, "Cammins"),
                new Driver(" Иванов Иван Иванович", 50, 12),
                1600);
        System.out.println(lorry);
        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
        SportCar sportCar = new SportCar("Ferrari",
                "Sport",
                60,
                new Engine(120, "Ferrari"),
                new Driver("Сидоров Петр Петрович", 45, 13),
                250);
        System.out.println(sportCar);
        sportCar.start();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.stop();
    }
}
