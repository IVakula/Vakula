package course.lesson7;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Cat(0.6, 200),
                new Human(1.9, 1500),
                new Robot(3.0, 6000)};
        Obstacle[] obstacles = {new Wall(0.5),
                new RunningTrack(700),
                new Wall(0.9),
                new RunningTrack(3000),
                new Wall(2.0)};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    break;
                }
            }
        }

    }
}

