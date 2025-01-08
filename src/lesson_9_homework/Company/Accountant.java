package lesson_9_homework.Company;

public class Accountant implements Position{
    String name;
    String surname;
    int age;

    Accountant(String name, String surname, int age) {
        this.name = name;
        this.surname= surname;
        this.age=age;
    }


    @Override
    public void printPosition() {
        System.out.println("Должность: Бухгалтер");
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age ;
    }
}
