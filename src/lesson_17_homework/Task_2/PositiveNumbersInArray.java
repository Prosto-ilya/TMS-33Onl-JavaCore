package lesson_17_homework.Task_2;

import java.util.Arrays;
import java.util.function.Predicate;

public class PositiveNumbersInArray {
        public static void main(String[] args) {
            Integer[] numbers = {-65, 11, -8, 15, 0, 2, 4};
            Predicate<Integer> isPositive = num -> num > 0;
            Arrays.stream(numbers).filter(isPositive).forEach(System.out::println);
        }
}

