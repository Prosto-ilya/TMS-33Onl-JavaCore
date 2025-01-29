package lesson_12_homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {

    public static Scanner getInput(){
        return new  Scanner(System.in);

    }
    public static void AbbreviationInRegularExpressions(){
        System.out.println("Please, enter an abbreviation (2-6 letter: ");
        String input = getInput().nextLine();
        Pattern pattern = Pattern.compile( "(\\p{Lu}{2,6})");
        Matcher mather = pattern.matcher(input);
        System.out.println("Abbreviation: ");
        if (mather.find()){
            System.out.println(mather.group());
        }


    }

}
