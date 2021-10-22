package course.lesson7;

public class RunningTrack extends Obstacle {


    public RunningTrack(double lengthTrack) {
        this.name = "Беговая дорожка";
        this.parameter = lengthTrack;
    }

    @Override
    void move(Participant participant) {
        participant.run();
    }

    @Override
    boolean checkup(Participant participant) {
        return participant.getMaxDistance() >= this.parameter;
    }

    @Override
    double getParameterParticipant(Participant participant) {
        return participant.getMaxDistance();
    }
}
