package lesson_17_homework.Task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вашу дату рождения ( ГГГГ-ММ-ДД): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate hundredYearsLater = birthDate.plusYears(100);
        System.out.println("Вам исполнится 100 лет: " + hundredYearsLater);
    }
}