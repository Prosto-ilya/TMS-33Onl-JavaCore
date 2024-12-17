package Lesson_6_homework.ATM;

public class MyMain {
    public static void main(String[] args){
    ATM atm = new ATM(20,15, 10);//количество купюр в банкомате
        atm.getInformationATM();
    atm.addMoney();
   // atm.getWithdrawal();
    atm.getWithdrawalOne();
    }
}

