package lesson_17_homework.Task_3;

import java.util.Scanner;
import java.util.function.Function;

public class Converter {
    public static void main(String[] args) {
        Function<String, Double> convertToDollars = input -> {
            String[] parts = input.split(" ");
            double amountBYN = Double.parseDouble(parts[0]);
            double exchangeRate = 0.29;
            return amountBYN * exchangeRate;
        };
        System.out.println("Please, enter sum in BYN");
        Scanner input = new Scanner(System.in);
        double inputValue = input.nextDouble();
        double amountUSD = convertToDollars.apply(String.valueOf(inputValue));
        System.out.println("Sum in $: " + amountUSD);
    }
}


