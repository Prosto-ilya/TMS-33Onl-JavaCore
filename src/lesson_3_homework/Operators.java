package lesson_3_homework;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        useEvenOrOddNumber();
        System.out.println("-------------------------------");
        useOutsideTemperature();
        System.out.println("-------------------------------");
        useSquares();
        System.out.println("-------------------------------");
        useSequenceOfNumbers();
        System.out.println("-------------------------------");
        useCheckNumber();
        System.out.println("-------------------------------");

    }

    //Task 1//
    public static void useEvenOrOddNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your number ...");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }

    //Task_2//
    public static void useOutsideTemperature() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter outside temperature ");
        int temperature = input.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    //Task_3//

    public static void useSquares() {
        for (int value = 10; value <= 20; value++) {
            System.out.println("The square of " + value + " is " + (value * value));
        }
    }

    //Task_4//
    public static void useSequenceOfNumbers() {
        int value = 7;
        while (value <= 98) {
            System.out.println(value);
            value += 7;
        }
    }
    //Task_*//

    public static void useCheckNumber() {
        Scanner input = new Scanner(System.in);

            System.out.println("Please,enter positive number");
            if (input.hasNextInt()) {
               int value = input.nextInt();
                if(value>0) {
                    int sum = 0;
                    for (int i=0; i <=value; i++){
                        sum+=i;
                    }
                    System.out.println("The Sum for 1 to " + value + " is " +sum);
                } else {
                    System.out.println("Error");
                    input.nextInt();
                }
            }


    }
}



