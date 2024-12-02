package lesson_3_homework;

import java.util.Scanner;

public class ArifmeticsOperators {
    public static void main(String[] args) {
        useFormalOne();
        System.out.println("--------------------------------------");
        useAddition1();
        System.out.println("--------------------------------------");
        useAddiction2();
        System.out.println("--------------------------------------");
        useRoundedN();
         System.out.println("--------------------------------------");
        useDivisionWithRemainder();
        System.out.println("--------------------------------------");
        useChangePlace();
    }

    /* Task_1 */

    public static void useFormalOne() {
        int a, b = 1, c = 2;
        a = 4 * (b + c - 1) / 2;
        System.out.println("The result is.... " + a);
    }

    /* Task_2*/

    public static void useAddition1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int number = input.nextInt();
        int result1 = (number / 10);
        int result2 = (number % 10);
        int sum = result1 + result2;
        System.out.println("Число " + number + " состоит из цифры " + result1 + " и " + result2);
        System.out.println("Сумма цифр: " + sum);

    }

    /* Task3 */
    public static void useAddiction2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your number");
        int number = input.nextInt();
        int result1 = (number / 100);
        int result2 = ((number / 10) % 10);
        int result3 = (number % 10);
        int sum = result1 + result2 + result3;
        System.out.println(sum);
    }

    /* Task_4 */
    public static void useRoundedN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your number");
        float n = input.nextFloat();
        int rounded;
        if (n >= 0) {
            rounded = (int) (n + 0.5);
        } else {
            rounded = (int) (n - 0.5);
        }
        System.out.println(rounded);
    }
    /*Task_5*/
    public static void useDivisionWithRemainder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your number  ");
        int q = input.nextInt();
        System.out.println(" You enter number "+ q);

        System.out.println("Enter the second number");
        int w = input.nextInt();
        System.out.println(" You enter number " +w);
        int division = q/w;
        System.out.print("Devision result = " +division);
        int remainder= (q%w);
        System.out.print(" and remainder = " +remainder);
    }
    //Task*//
    public static void useChangePlace() {
       Scanner input = new Scanner(System.in);
       System.out.println("Please, enter the first number ");
       int a = input.nextInt();
       System.out.println("Please, enter the second number ");
       int b = input.nextInt();
       int result = a+b;
       a=result-a;
        System.out.println("The first number = " + a);
       b=result-b;
        System.out.println("The second number = " + b);
    }
}


