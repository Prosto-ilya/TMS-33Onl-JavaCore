package lesson_20_homework.Task_1;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива через пробел:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Thread maxThread = new Thread(() -> {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Максимум: " + max);
        });

        Thread minThread = new Thread(() -> {
            int min = array[0];
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("Минимум: " + min);
        });

        maxThread.start();
        minThread.start();

        maxThread.join();
        minThread.join();
    }
}