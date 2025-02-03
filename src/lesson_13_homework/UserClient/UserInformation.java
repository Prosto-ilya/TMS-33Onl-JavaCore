package lesson_13_homework.UserClient;

import java.util.Scanner;

public class UserInformation {
    public static void main (String[] args){
        System.out.println("Please, enter your login and password.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your login : ");
        String login=input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        System.out.println("Confirm your password : ");
        String confirmPassword = input.nextLine();
        System.out.println("You entered a login : " + login);
        System.out.println("You entered a password : "+ password);

        try {
            boolean result = validation(login, password, confirmPassword);
            System.out.println("Verification successful: " + result);
        } catch (WrongLoginExceptions e) {
            System.err.println("login ERROR: " + e.getMessage());
        } catch (WrongPasswordExceptions e) {
            System.err.println("Password ERROR: " + e.getMessage());
        }
    }

    public static boolean validation(String login, String password, String confirmPassword)
            throws WrongLoginExceptions,WrongPasswordExceptions{

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginExceptions
                    ("Login must be less than 20 characters and not contain spaces.");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches("[A-Za-z0-9_]+")) {
            throw new WrongPasswordExceptions
                    ("The password must be less than 20 characters, not contain spaces, " +
                            "                                                       and include at least one number.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExceptions
                    ("The passwords do not match.");
        }

        return true;
    }
}
