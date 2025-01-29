package lesson_12_homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    public static Scanner getInput() {
        return new Scanner(System.in);
    }


    public static void repressionOfInformation() {
        System.out.println("Please, enter the text: ");
        String input = getInput().nextLine();


        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String documentNumberRegex = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String phoneRegex = "\\+375\\(\\d{2}\\)\\d{3}-\\d{2}-\\d{2}";

        Matcher email = Pattern.compile(emailRegex).matcher(input);
        if (email.find()) {
            System.out.println("Email: " + email.group());
        } else {
            System.out.println("Not found");
        }

        Matcher documentNumber = Pattern.compile(documentNumberRegex).matcher(input);
        if (documentNumber.find()) {
            System.out.println("Document number : " +documentNumber.group());
        }else {
            System.out.println("Not found");
        }
        Matcher phone = Pattern.compile(phoneRegex).matcher(input);
        if (phone.find()) {
            System.out.println("Phone: " + phone.group());
        }else {
            System.out.println("Not found");
        }
    }
}

