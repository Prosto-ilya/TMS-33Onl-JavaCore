package lesson_10_homework.Task_2;

import java.util.Scanner;

public class MyMain {
    private static final User[] usersDatabase = {
            new User(1, "Ivan","Ivanov", "ivan.ivanov@gmail.com"),
            new User(2, "Maria","Petrova", "maria.petrova@gmail.com"),
            new User(3,"Petr","Petrenko", "petr.petrenko@gmail.com")
    };

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип клонирования (1 - поверхностное, 2 - глубокое): ");
        int cloneType = scanner.nextInt();

        System.out.print("Введите ID пользователя для клонирования: ");
        int userId = scanner.nextInt();

        User originalUser = findUserId(userId);
        if (originalUser == null) {
            System.out.println("Пользователь не найден.");
            return;
        }

        User clonedUser = (cloneType == 1) ? (User) originalUser.clone() : originalUser.deepClone();

        System.out.println("Оригинал: " + originalUser);
        System.out.println("Клонированный: " + clonedUser);
        System.out.println("Равны: " + originalUser.equals(clonedUser));
    }

    private static User findUserId(int id) {
        for (User user : usersDatabase) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
