package course.lesson3.task1;

public class Person {
   private String firstName;
   private String lastName;
   private String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Person(String fullName) {
        String[] fullNameArray = fullName.split(" ");
        this.firstName = fullNameArray[0];
        this.lastName = fullNameArray[1];
        this.patronymic = fullNameArray[2];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "Person {" +
                "Фамилия ='" + firstName + '\'' +
                ", Имя ='" + lastName + '\'' +
                ", Отчество ='" + patronymic + '\'' +
                '}';
    }

}
