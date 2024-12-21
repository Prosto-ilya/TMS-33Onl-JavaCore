package lesson_7_homework_.Clinic;

public class Surgeon extends Doctors{
    public Surgeon(String name, String surname, int age, String position, int experience) {
        super(name, surname, age, position, experience);
    }
// переопределение метода
    @Override
    public void task() {
        System.out.println("I am a surgeon. My task is make operations.");
    }
}
