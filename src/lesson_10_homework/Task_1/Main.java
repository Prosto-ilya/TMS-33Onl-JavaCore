package lesson_10_homework.Task_1;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Ivan","Ivanov", "ivan@gmail.com");
        User user2 = new User(1, "Ivan","Ivanov", "ivan@gmail.com");
        User user3 = new User(2, "Maria","Petrova", "maria@gmail.com");
        User user4 = new User(3, "Maria","Ivanova", "MariaIv@gmail.com");

        System.out.println("Compare user1 и user2: " + user1.equals(user2));
        System.out.println("Compare user1 и user3: " + user1.equals(user3));
        System.out.println("Compare user3 и user4: " + user3.equals(user4));

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}