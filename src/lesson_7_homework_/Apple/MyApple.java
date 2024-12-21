package lesson_7_homework_.Apple;

public class MyApple {

    public static void main(String[] args) {
        Apple apple = new Apple("Green");

        System.out.println("Before : " + apple);

        apple.changeColor("Red");

        System.out.println("After: " + apple);
    }
}
