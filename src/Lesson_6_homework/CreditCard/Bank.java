package Lesson_6_homework.CreditCard;

import java.util.Scanner;


public class Bank {
    public static void main(String[] args){


        CreditCard sberbank = new CreditCard(1111, 30000);
        CreditCard alpha = new CreditCard(2222, 40000);
        CreditCard belAg = new CreditCard(3333,50000);
       // int bank = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number of card ");
        int checkAccountNumber = input.nextInt();

        if (checkAccountNumber == sberbank.accountNumber){
          // bank = sberbank.accountNumber;
            sberbank.getCardReplenishment(sberbank.accountBalance);
            sberbank.getWithdrawal(sberbank.accountBalance);
            sberbank. getInformation();

        } else if (checkAccountNumber == alpha.accountNumber){
           // bank = alpha.accountBalance;
            alpha.getCardReplenishment(alpha.accountNumber);
            alpha.getWithdrawal(alpha.accountBalance);
            alpha. getInformation();

        }else if(checkAccountNumber== belAg.accountNumber){
            belAg.getCardReplenishment(belAg.accountNumber);
            belAg.getWithdrawal(belAg.accountBalance);
            belAg. getInformation();
        }


    }




}







