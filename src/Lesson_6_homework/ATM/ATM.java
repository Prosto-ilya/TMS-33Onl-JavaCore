package Lesson_6_homework.ATM;

import java.util.Scanner;

public class ATM {
    int twentyBill = 20;
    int fiftyBill = 15;
    int oneHundredBill= 10;
    int amountMoney = (twentyBill*20) + (fiftyBill*50) + (oneHundredBill*100);

    public void getInformationATM(){
        System.out.println("Money in ATM: " + amountMoney );
    }

    public ATM(int twentyBill, int fiftyBill, int oneHundredBill){
        this.twentyBill=twentyBill;
        this.fiftyBill = fiftyBill;
        this.oneHundredBill = oneHundredBill;

    }
        public void addMoney(){
            System.out.println("Please, enter the bill of 20$:");
            int twenty= getInput().nextInt();
            twentyBill += twenty;

            System.out.println("Please, enter the bill of 50 $: ");
            int fifty = getInput().nextInt();
            fiftyBill += fifty;

            System.out.println("Please, enter the bill of 100$:");
            int oneHundred=  getInput().nextInt();
            oneHundredBill +=  oneHundred;
             int amountDeposited = (20 * twenty) + (50 * fifty)+(100 * oneHundred);
            System.out.println("You add" + "\n" + "banknote 20$: " +  twenty + "\n" + " banknote 50$: " + fifty + "\n" +
                    " banknote 100$: " +  oneHundred);
            System.out.println("The amount deposited: " +amountDeposited );

            //System.out.println("all money in ATM " + (amountMoney + amountDeposited));
        }

        /*public void getWithdrawal() {

            System.out.println("Enter the number of bills to withdraw ");
                System.out.println("Enter the bill of 20$: ");
                int twenty = getInput().nextInt();
                twentyBill += twenty;

                System.out.println("Enter the bill of 50$: ");
                int fifty = getInput().nextInt();
                fiftyBill += fifty;

                System.out.println("Enter the bill of 100$: ");
                int oneHundred = getInput().nextInt();
                twentyBill += oneHundred;

                int withdrawlDeposited = (20 * twenty) + (50 * fifty) + (100 * oneHundred);
                if (withdrawlDeposited < amountMoney) {
                    System.out.println("the operation was successful! ");
                } else {
                    System.out.println("Error, there is no such money in the ATM ");
                }
        }*/

        public void getWithdrawalOne(){

            System.out.println("Пожалуйста, введите сумму которою вы бы хотели снять." +
                    " Доступные номиналы для снятия :$20, $50, $100");
            int withdrawalMoney = getInput().nextInt();
           int bill100=0;
           int bill50=0;
           int bill20 = 0;
            if (withdrawalMoney<=amountMoney) {
                System.out.println("Операция началась");//350$
            }
            //370
            if (withdrawalMoney>=100) {
                bill100 = withdrawalMoney / 100;//3
                int value100 = withdrawalMoney % 100;//70

                    bill50 = value100 / 50;//1
                int value50 = value100 % 50;//20

                bill20 = value50 / 20;//1
                int value20 = value50 % 20;//0
                if (value20 > 0) {
                    System.out.println("Введите другое значение. В банкомате нет такого номинала");
                    return;

                }
            }else if (withdrawalMoney<100){

                bill50 = withdrawalMoney / 50;//1
                int value50 = withdrawalMoney % 50;//20
                bill20 = value50 / 20;//1
                int value20 = value50 % 20;//0
                if (value20 > 0) {
                    System.out.println("Введите другое значение. В банкомате нет такого номинала");
                    return;
                }
                else if (withdrawalMoney<=50){
                    bill20 = withdrawalMoney / 20;//2
                     value20 = withdrawalMoney % 20;//0
                    if (value20 > 0) {
                        System.out.println("Введите другое значение. В банкомате нет такого номинала");

                        return;


                    }
                }

            }
                    System.out.println("Купюр номиналом 100$ внесено " + bill100 );
                    System.out.println("Купюр номиналом 50$ внесено " + bill50 );
                    System.out.println("Купюр номиналом 20$ внесено " + bill20 );

                }
        public Scanner getInput() {
            return new Scanner(System.in);
        }
}

