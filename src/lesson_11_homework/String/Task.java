package lesson_11_homework.String;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Comparator.comparingInt;

public class Task {

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static void stringLength() {
        String[] string = new String[3];
        System.out.println("Please, enter 3 lines...");
        for (int index = 0; index < 3; index++) {
            System.out.println("Enter line " + (index + 1) + ":");
            string[index] = getInput().nextLine();

        }
        String shortest = string[0];
        String longest = string[0];
        for (int index = 1; index < string.length; index++) {
            if (string[index].length() < longest.length()) {
                shortest = string[index];
            }
            if (string[index].length() > longest.length()) {
                longest = string[index];
            }

        }
        System.out.println("Самая короткая строка: " + shortest + "." + "Ее длина составляет: " + shortest.length()
                + " символа");
        System.out.println("Самая длинная  строка: " + longest + "." + "Ее длина составляет: " + longest.length()
                + " символа");

    }

    public static void stringIncrease() {
        String[] string = new String[3];
        System.out.println("Please, enter 3 lines...");
        for (int index = 0; index < string.length; index++) {
            System.out.println("Enter line " + (index + 1) + ":");
            string[index] = getInput().nextLine();
        }

        Arrays.sort(string, comparingInt(String::length));
        for (String str : string) {
            System.out.println("Строка " + str + " имеет длину: " + str.length() + " символов");
        }
    }

    public static void stringAverage() {
        String[] string = new String[3];
        System.out.println("Please, enter 3 lines...");
        for (int index = 0; index < string.length; index++) {
            System.out.println("Enter line " + (index + 1) + ":");
            string[index] = getInput().nextLine();
        }

        double resultLength = 0;
        for (String str : string) {
            resultLength += str.length();
        }
        double averageLength = resultLength / 3.0;
        System.out.println("Cредняя длина строки" + averageLength);
        System.out.println("\tСтроки, имеющие длину строки, меньше средней их всех: ");
        for (String str : string) {
            if (str.length() < averageLength) {

                System.out.println("\t\tСтрока " + str + " имеет длину: " + str.length() + " символов");
            }
        }

    }

    public static void uniqueSymbol() {
        String[] string = new String[3];
        System.out.println("Please, enter 3 lines...");
        for (int index = 0; index < string.length; index++) {
            System.out.println("Enter line " + (index + 1) + ":");
            string[index] = getInput().nextLine();
        }
        String result=null;
        for(String str: string){
            if(uniqueValue(str)){
                result=str;
                break;
            }
        }
        if (result !=null) {
            System.out.println("Первое слово с унткальными символами " + result);
        }else{
            System.out.println("Слов с уникальными символами не найдено...");
        }
    }


    public static boolean uniqueValue(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void stringDuplication(){
        System.out.println("Enter the line...");
        String input= getInput().nextLine();

        StringBuilder duplication = new StringBuilder();
        for(char i : input.toCharArray()) {
            duplication.append(i).append(i);

        }
        System.out.println("Result: "+duplication);
    }
    public static void palidromeCheck(){
        System.out.println("Введите строку: ");
        String input = getInput().nextLine();
        System.out.println("Введите номер слова для проверки: ");
        int indexOfWord = getInput().nextInt();
        String[] word = input.split("\\s+");

        if(indexOfWord<1 || indexOfWord>word.length){
            System.out.println("Error, enter correct value");
        } else{
            String wordCheck = word[indexOfWord-1];
            if (isPalindrome(wordCheck)){
                System.out.println( wordCheck +" is a palindrome");
            }else {
                System.out.println(wordCheck + " is not a palindrome");
            }
        }




    }
    public static boolean isPalindrome(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}





