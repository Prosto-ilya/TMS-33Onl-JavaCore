package lesson_17_homework.Task_5;

import java.util.Scanner;
import java.util.function.Supplier;

public class ReverseString {

        public static void main(String[] args) {
            Supplier<String> reverseInput = () -> {
                Scanner input = new Scanner(System.in);
                String inputString = input.nextLine();
                return new StringBuilder(inputString).reverse().toString();
            };

            System.out.println("Введите строку:");
            String reversed = reverseInput.get();
            System.out.println("Строка задом наперед: " + reversed);
        }
    }

