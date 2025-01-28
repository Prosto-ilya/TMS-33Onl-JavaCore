package com.game.guessword;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyGuessWord {
    public static void main(String[] args) {
        // 1. Welcoming statement
        // 2. Instruction -> if you consider to play, enter y -> next step, if n -> leave
        // 2.1. if leave -> finish the game
        // 2.2. if move on ->
        // 3. Let's have a set of words and try to guess this words
        // 4. We need to offer a player to guess a word or a letter
        // 5. If one letter has been entered -> guess a letter
        // 5.1. if more than one letter has been entered -> guess the word
        // 6. If you have guessed a word, check, YOU WON
        // 6.1. Ask would you like to play again and repeat the whole game
        // 6.2. If not, continue
        // 7. If you have guessed a letter, move on until all letters are opened
        // 7.1. If you have not guessed a letter ask to repeat
        // Проверка на повторы - если у меня в массиве две Р, три А, они все должны быть показаны
        // Открыты и больше он не должен на них реагировать или же сказать, что вы уже эту букву открыли
        startGame();                  //создали метод
    }


    public static void startGame(){
        welcome();
        // System.out.println(getHiddenWord());
        // Временная точка проверки Смотрим, что возвращает нам метод getHiddenWord

        char[] hiddenWord = getHiddenWord().toCharArray(); // Слово из стринга привел в массив
        char[] openWord = new char[hiddenWord.length];  //создаем массив "Открытое слово " на подобие массива hiddenWord(метод копирования)
        System.arraycopy(hiddenWord,0,openWord,0,hiddenWord.length);

        /* System.arraycopy() ... (Копирование массива)То же самое... for(int index = 0; index<hiddenWord.length; index++){
        openWord[index] = hiddenWord[index]} */

        Arrays.fill(openWord,0,openWord.length,'*'); // Метод для Заполнение всего массива элементом *



        System.out.println();
        playOrNot();


        //equals -применятся для сравнения объектов на равенство
        // while (true) ... game main code ...

        if(getInput().nextLine().equals("y")){
            //Play game
            getMessagePlay();
            printWord(openWord);
            getInputMessage();


            while (true){
                String input = getInput().nextLine();
                if (input.length() == 0){

                    System.out.println("You have entered no value. Please, re-enter value");
                    continue;
                } else if (input.length()==1){
                    //if I entered 1 symbol
                    checkLetter();
                    break;
                }else{
                    checkWord(input, hiddenWord);
                    break;
                }


            }


        } else {
            System.out.println("\u001B[35m" + "You have decided to leave a game... GOODBYE" + "\u001B[0m");



            return;// выходим из игры
        }


    }

    public static void welcome(){
        System.out.println("\u001B[34m");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Welcome to Guess a World Game by TMS ");
        System.out.println("The instructions are following.");
        System.out.println("If you enter a letter, we will cher if there is a math");
        System.out.println("If there is, we open it on the table and game moves om");
        System.out.println("If not, repeat and try to guess a letter ");
        System.out.println("If you have guess all letters, you HAVE WON");
        System.out.println("If you enter two or more characters than we check a word fully");
        System.out.println("If you guess the word, you HAVE WON ");
        System.out.println("If not, you continue the game!");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[0m");
    }

    // создаем какое-то количество слов и вернуть их Вернет массив слова

    public static String[] getArrayOfWords(){
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


    public static String getHiddenWord(){
        //Вызываем метод getArrayOfWords
        String [] hiddenWord = getArrayOfWords();// возвращаем getArrayOfWord Возвращаем из целого списка
        //слов, которое хотим
        // Возвращаем один индекс
        return hiddenWord[new Random().nextInt(0,hiddenWord.length)];// позволяет взять слово по индексу

    }
    public static void printWord(char[] word){
        for(char element : word){
            System.out.print("'" + element+ "' ");
        }

    }
    public static void playOrNot(){
        System.out.println("\u001B[31m");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("If you want to play, enter y or any other value... to leave");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\u001B[0m");

        getInput();// вызов метода Scanner (getInput) для ввода значения
    }

    public static Scanner getInput(){
        return new Scanner(System.in);

    }
    public static void getMessagePlay(){
        System.out.println("Hidden word has been set. We can start a game now...");
    }
    public static void getInputMessage(){
        System.out.println("You see a hidden word on your screen. Please, enter a letter or a whole word: ");
    }

    public static void checkLetter(){
        // check a letter in the hidden word
        System.out.println("You have entered a letter and this method is responsible for the check...");

    }

    public static void checkWord(String input, char[] hiddenWord){
        //check a word in the hidden word
        System.out.println("You have entered a word: " + input);
        System.out.println("Your hidden word equals: " +Arrays.toString(hiddenWord));


        // сравнение дву массивом между собой
        //Если мы угадали слово, то вывод сообщения, если нет, продолжаем играть
        if (!Arrays.equals(input.toCharArray(), hiddenWord)){
            System.out.println("You have entered a wrong word.");
        }else {
            getWonMessage();
        }
    }
    public static void getWonMessage(){
        System.out.println("\u001B[43m"+" Congratulation!!! YOU HAVE WON! "+ "\u001B[0m");

    }
}









