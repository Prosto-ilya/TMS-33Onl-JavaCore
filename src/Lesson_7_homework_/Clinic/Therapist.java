package Lesson_7_homework_.Clinic;



public class Therapist extends Doctors {
    public Therapist(String name, String surname, int age, String position, int experience) {
        super(name, surname, age, position, experience);
    }


    @Override
    public void task() {
        System.out.println("I am a therapist");

    }
}

