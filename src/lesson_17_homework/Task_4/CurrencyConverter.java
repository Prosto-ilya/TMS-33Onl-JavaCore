package lesson_17_homework.Task_4;

import java.util.function.Consumer;

public class CurrencyConverter {
        public static void main(String[] args) {
            final double exchangeRate = 3.4;

            Consumer<String> convertToUSD = input -> {
                String[] parts = input.split(" ");
                if (parts.length == 2 && parts[1].equals("BYN")) {
                    try {
                        double amountBYN = Double.parseDouble(parts[0]);
                        double amountUSD = amountBYN / exchangeRate;
                        System.out.printf("Сумма в долларах: %.2f USD%n", amountUSD);
                    } catch (NumberFormatException e) {
                        System.out.println("Некорректный формат суммы.");
                    }
                } else {
                    System.out.println("Введите строку в формате 'сумма BYN'.");
                }
            };

            convertToUSD.accept("50 BYN");
            convertToUSD.accept("abc BYN");
            convertToUSD.accept("25 USD");
        }
    }

