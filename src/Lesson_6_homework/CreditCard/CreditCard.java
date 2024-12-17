package Lesson_6_homework.CreditCard;

import java.util.Scanner;

public class CreditCard{

    int accountNumber;// номер счета
    int accountBalance ;//Сумма на счете

    public CreditCard(int accountNumber,int accountAmount){
        this.accountNumber = accountNumber;
        this.accountBalance = accountAmount;
    }
    public void getCardReplenishment(int amount){
        System.out.println("Please, write the $ to top up card: ");
        amount = getInput().nextInt();
        if(amount>0){
            accountBalance +=amount;
            System.out.println(accountBalance);
        }
    }
    public void getWithdrawal( int amount ){
        System.out.println("Please, write the $ to - card: ");
        amount = getInput().nextInt();
        if(amount>=0){
            accountBalance -=amount;
            System.out.println(accountBalance);
        }
    }
    public void getInformation(){
        System.out.println("The account number is " + accountNumber + "\n" +"The balance is" + accountBalance);

    }
    public static Scanner getInput() {
        return new Scanner(System.in);
    }

}





