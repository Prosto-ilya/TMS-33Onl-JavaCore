package lesson_9_homework.Company;

public class Director implements Position{
    private final String name;
   private final String surname;
    private final int age;

    Director(String name, String surname, int age) {
        this.name = name;
        this.surname= surname;
        this.age=age;
    }

    @Override
    public String toString() {
        return "'Director " +
                "name= " + name +'\'' +
                ", surname ='" + surname + '\'' +
                ", age=" + age
                ;
    }


    @Override
    public void printPosition() {
        System.out.println("Должность: Директор");




    }
}
