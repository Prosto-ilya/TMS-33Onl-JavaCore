package lesson_20_homework.Task_2;

import java.util.Arrays;
import java.util.Random;

public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new Random().ints(11, 0, 100).toArray();
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортировка вставками
        Thread insertionSortThread = new Thread(() -> {
            int[] sorted = Arrays.copyOf(array, array.length);
            for (int i = 1; i < sorted.length; i++) {
                int key = sorted[i];
                int j = i - 1;
                while (j >= 0 && sorted[j] > key) {
                    sorted[j + 1] = sorted[j];
                    j--;
                }
                sorted[j + 1] = key;
            }
            System.out.println("Сортировка вставками: " + Arrays.toString(sorted));
        });

        // Сортировка выбором
        Thread selectionSortThread = new Thread(() -> {
            int[] sorted = Arrays.copyOf(array, array.length);
            for (int i = 0; i < sorted.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < sorted.length; j++) {
                    if (sorted[j] < sorted[minIdx]) {
                        minIdx = j;
                    }
                }
                int temp = sorted[minIdx];
                sorted[minIdx] = sorted[i];
                sorted[i] = temp;
            }
            System.out.println("Сортировка выбором: " + Arrays.toString(sorted));
        });

        // Сортировка пузырьком
        Thread bubbleSortThread = new Thread(() -> {
            int[] sorted = Arrays.copyOf(array, array.length);
            for (int i = 0; i < sorted.length - 1; i++) {
                for (int j = 0; j < sorted.length - 1 - i; j++) {
                    if (sorted[j] > sorted[j + 1]) {
                        int temp = sorted[j];
                        sorted[j] = sorted[j + 1];
                        sorted[j + 1] = temp;
                    }
                }
            }
            System.out.println("Сортировка пузырьком: " + Arrays.toString(sorted));
        });

        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();

        insertionSortThread.join();
        selectionSortThread.join();
        bubbleSortThread.join();
    }
}
