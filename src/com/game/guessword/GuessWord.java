package com.game.guessword;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        welcome();

        char[] hiddenWord = getHiddenWord().toCharArray();
        char[] openWord = new char[hiddenWord.length];
        Arrays.fill(openWord, '*');

        playOrNot();

        if (getInput().nextLine().equals("y")) {
            getMessagePlay();
            printWord(openWord);
            System.out.println();
            getInputMsg();
//equals -применятся для сравнения объектов на равенство
            while (true) {
                String input = getInput().nextLine();

                if (input.length() == 0) {
                    System.out.print("You have entered no value. Please, re-enter: ");
                    continue;
                } else if (input.length() == 1) {
                    // Check if the input is a single letter
                    char guessedLetter = input.charAt(0);//возвращает значение char по указанному индексу;
                    if (checkLetter(guessedLetter, hiddenWord, openWord)) {
                        if (Arrays.equals(openWord, hiddenWord)) {
                            getWonMessage();

                            break; // Exit game if won
                        }
                    } else {
                        System.out.println("The letter '" + guessedLetter + "' is not in the word.");
                    }
                } else if (input.length() > 1) {
                    if (checkWord(input, hiddenWord)) {
                        break; // Exit game if won
                    } else {
                        System.out.print("You have entered a wrong word. Please, re-enter: ");
                    }
                }

                printWord(openWord);
                getInputMsg();
            }
        } else {
            System.out.println("\u001B[35m" + "You have decided to leave the game... GOODBYE!" + "\u001B[0m");
        }
    }

    public static void welcome() {
        System.out.println("\u001B[34m");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome to Guess a Word Game by TMS.");
        System.out.println("The instructions are the following.");
        System.out.println("If you enter a letter, we will check if there is a match.");
        System.out.println("If there is, we open it on the table and the game moves on.");
        System.out.println("If not, repeat and try to guess a letter.");
        System.out.println("If you have guessed all letters, you HAVE WON.");
        System.out.println("If you enter two or more characters, we check the word fully.");
        System.out.println("If you guessed the word, you HAVE WON.");
        System.out.println("If not, you continue the game.");
        System.out.println("------------------------------------------------------------------" + "\u001B[0m");
    }

    public static String[] getArrayOfWords() {
        return new String[]{
                "Apple",
                "Banana",
                "Flat",
                "House",
                "Pineapple",
                "Belarus",
                "Georgia",
                "Infrastructure",
                "Housewife",
                "Feminist",
                "Universe",
                "Galaxy",
                "Stars",
                "Mexico",
                "Watermelon",
                "Housekeeper"
        };
    }

    public static String getHiddenWord() {
        String[] hiddenWord = getArrayOfWords();
        return hiddenWord[new Random().nextInt(hiddenWord.length)];
    }

    public static void printWord(char[] word) {
        for (char element : word) {
            System.out.print("'" + element + "'  ");
        }
        System.out.println();  // New line for better readability
    }

    public static void playOrNot() {
        System.out.println("\u001B[31m" + "------------------------------------------------------------------");
        System.out.print("If you want to play, enter y or any other value to leave: " + "\u001B[0m");
    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static void getMessagePlay() {
        System.out.println("Hidden word has been set. We can start a game now...");
    }

    public static void getInputMsg() {
        System.out.print("You see a hidden word on your screen. Please, enter a letter or a whole word: ");
    }

    public static boolean checkLetter(char guessedLetter, char[] hiddenWord, char[] openWord) {
        boolean found = false;

        for (int i = 0; i < hiddenWord.length; i++) {
            if ((hiddenWord[i]) == (guessedLetter)) {
                openWord[i] = hiddenWord[i];
                found = true;
            }
        }

        return found; // Return true, if we found the letter;
    }

    public static boolean checkWord(String input, char[] hiddenWord) {
        System.out.println("You have entered a word: " + input);
        System.out.println("Your hidden word equals: " + Arrays.toString(hiddenWord));

        if (Arrays.equals(input.toCharArray(), hiddenWord)) {
            getWonMessage();
            return true;
        } else {
            System.out.println("You have entered a wrong word.");
        }

        return false;
    }

    public static void getWonMessage() {
        System.out.println("\u001B[33m\t" + "Congratulations! YOU HAVE WON!" + "\u001B[0m");
    }

    }
