package lesson_8_homework;

public class MyMain {
    public static void main(String[] args){


        Animal dog = Dog.Dog2();
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");

        System.out.println("---------------------------------");
        Animal tiger = new Tiger();
            tiger.voice();
            tiger.eat("Meat");
            tiger.eat("Grass");
        System.out.println("---------------------------------");
        Animal rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");


    }
}
