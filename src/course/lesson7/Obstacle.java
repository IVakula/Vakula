package course.lesson7;

public abstract class Obstacle {
    protected double parameter;
    protected String name;

    abstract void move(Participant participant);
    abstract double getParameterParticipant(Participant participant);
    abstract boolean checkup(Participant participant);

    boolean overcome (Participant participant){
        move(participant);
        boolean checkupResult = checkup(participant);
        if(checkupResult){
            System.out.println("Участник \"" + participant.getName() + "\" прошел препятствие \"" + this.name +
                    "\" на дистанции " + this.parameter + " м");
        } else{
            System.out.println("Участник \"" + participant.getName() + "\" не прошел препятствие \"" + this.name +
                    "\" на дистанции " + this.parameter + " м. Пройдено " + getParameterParticipant(participant) + " м.");
        }
        return checkupResult;
    }
}
