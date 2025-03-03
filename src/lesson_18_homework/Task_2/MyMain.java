package lesson_18_homework.Task_2;

import java.util.*;


public class MyMain {
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();
        dataMap.put(1, "Alice");
        dataMap.put(2, "Bob");
        dataMap.put(5, "Charlie");
        dataMap.put(8, "David");
        dataMap.put(9, "Eve");
        dataMap.put(13, "Frank");
        dataMap.put(3, "George");
        Set<Integer> idSet = new HashSet<>(Arrays.asList(1, 2, 5, 8, 9, 13));
        List<String> result = dataMap.entrySet().stream()
                .filter(entry -> idSet.contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .toList();


        System.out.println("Имена с нечетным количеством букв, записанные задом наперед: " + result);
    }
}
