package lesson_5_homework;

import java.util.Random;
import java.util.Scanner;

public class multiArrays {
    public static void main(String[] args) {
        useMultiArray();
        System.out.println("----------------------------------------------------");
        useChessBoard();
        System.out.println("----------------------------------------------------");
        useMultiArraysSnake();

    }
    //Task_1

    public static void useMultiArray() {


        int rows = 3;
        int cols = 5;


        int[][] array = new int [rows][cols];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int value = input.nextInt();
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] += value;
                sum += array[i][j];
            }
        }
        System.out.println("New array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Sum of array's elements: " + sum);
    }

    //Task_2
    public static void useChessBoard() {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Task_*
    public static void useMultiArraysSnake() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter 'n':");
        int n = input.nextInt();
        System.out.println("Please, enter 'm': ");
        int m = input.nextInt();
        int[][] snakeArray = new int[n][m];

        int value = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    snakeArray[i][j] = value++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    snakeArray[i][j] = value++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(snakeArray[i][j]);
            }
            System.out.println();
        }
    }
}
















