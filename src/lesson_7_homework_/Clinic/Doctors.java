package lesson_7_homework_.Clinic;

import java.util.Scanner;

public class Doctors {
    private final String name;
    private final String surname;
    private final int age;
    private final String position;
    private final int experience;

    public Doctors(String name, String surname, int age, String position, int experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.experience = experience;
    }

    public void task() {
        System.out.println("This general method that explain what Doctor does...");
    }

    @Override
    public String toString() {
        return
                "Your doctor is" + "\n" + this.position+"\n"
                + "name=" + this.name + "\n" +
                " surname=" + this.surname + "\n" +
                " age=" + this.age + "\n" +
                "position=" + this.position + "\n" +
                " experience=" + this.experience ;
    }

    public static void chooseDoctor() {

        System.out.println("If you enter code 1, you can select 'Surgeon'");
        System.out.println("If you enter code 2, you can select 'Dentist'");
        System.out.println("If you enter code 3 or another value, you select 'Therapist' " +
                "to get more information of your plan of treatment ");
        System.out.println("Please, enter the code");
        int treatmentPlan = getInput().nextInt();
        if (treatmentPlan == 1) {
            System.out.println("You select a Surgeon");
            Surgeon surgeon = new Surgeon("Ivan", "Ivanov", 30, "Surgeon", 5);
            surgeon.task();
            System.out.println(surgeon);
            return;

        } else if (treatmentPlan == 2) {
            System.out.println();
            System.out.println("You select a Dentist");
            Dentist dentist = new Dentist("Ilya", "Petrenko", 40, "Dentist", 4);
            System.out.println(dentist);
            dentist.task();
            return;

        } else
            System.out.println("You select a Therapist");
                Therapist therapist=new Therapist(
                                            "Maria", "Sokolova",45,"Therapist", 2);
        System.out.println(therapist);
        therapist.task();


    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }
}
