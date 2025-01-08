package lesson_9_homework.Company;

public class MyCompany {
    public static void main(String[] args){
        Director director= new Director("Ivan", "Ivanov", 32);
        System.out.println(director);
        director.printPosition();

        Worker worker = new Worker("Petr", "Petrov", 22);
        System.out.println(worker);
        worker.printPosition();

        Accountant accountant = new Accountant("Maria", "Yakovleva",  33);
        System.out.println(accountant);
        accountant.printPosition();
    }
}
