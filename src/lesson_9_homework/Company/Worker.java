package lesson_9_homework.Company;

public class Worker implements Position {
    String name;
    String surname;
    int age;

    Worker(String name, String surname, int age) {
        this.name = name;
        this.surname= surname;
        this.age=age;
    }


    @Override
    public void printPosition() {
        System.out.println("Должность: Рабочий");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age;
    }
}
