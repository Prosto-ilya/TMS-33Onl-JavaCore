package lesson_15_homework.getRidUniqueValue;

import java.util.*;

public class uniqueValue {
    public static void main(String[] args) {
        System.out.println("Please, enter numbers : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numbersArray =input.split(",");
        Set<String> uniqueNumber = new LinkedHashSet<>(Arrays.asList(numbersArray));

        for(String number : uniqueNumber){
            System.out.println(number);
        }
    }
}
