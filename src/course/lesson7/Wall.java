package course.lesson7;

public class Wall extends Obstacle {


    public Wall(double height) {
        this.name = "Стена";
        this.parameter = height;
    }

    @Override
    void move(Participant participant) {
        participant.jump();
    }

    @Override
    boolean checkup(Participant participant) {
        return participant.getMaxJumpHeight() >= this.parameter;
    }

    @Override
    double getParameterParticipant(Participant participant) {
        return participant.getMaxJumpHeight();
    }

}

