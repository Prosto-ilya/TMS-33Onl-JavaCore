package lesson_7_homework_.Clinic;

import java.util.Scanner;

public  class User {
    private final String name;
    private final String surname;
    private final int age ;


    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';


    }
    public static void createUser(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter your Name");
        String name = input.nextLine();
        System.out.println("Please, enter your Surname");
        String surname =input.nextLine();

        System.out.println("Dear " + name +"\t"+ surname +",1" + "\t"+"We are glad to see you in our clinic!" );

    }
}
