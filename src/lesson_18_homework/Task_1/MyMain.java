package lesson_18_homework.Task_1;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
        numbers.add(1);

        int sumOfEvenNumbers = numbers.stream()
                .distinct() //delete duplicates
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue) // Преобразуем в IntStream
                .sum();
        System.out.println("Сумма четных элементов: " + sumOfEvenNumbers);
    }
}