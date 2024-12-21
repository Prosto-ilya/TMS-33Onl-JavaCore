package lesson_7_homework_.Clinic;

public class Dentist extends Doctors{

    public Dentist(String name, String surname, int age, String position, int experience) {
        super(name, surname, age, position, experience);
    }

    @Override
    public void task() {
        System.out.println("I am a dentist.My task is teeth");
    }
}
