package lesson_4_homework;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        usePrint();
        useMinAndMaxElements();
        useNullElement();
        useReplace();
        isIncrease();
        useArray();


    }

    public static void usePrint() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {

            System.out.println("Введите элемент массива");
            array[i] = input.nextInt();
        }
        System.out.println("Элементы в прямом порядке");
        for (int num : array) {
            System.out.print(num + "\t");

        }
        System.out.println();
        System.out.println("Элементы в обратном порядке");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }


    }

    //Task_2_and_3//
    public static void useMinAndMaxElements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);

            System.out.println(array[i]);
        }
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Минимальный элемент:" + min + " Индекс данного значения: " + indexMin);

        System.out.println("Максимальный элемент:" + max + " Индекс данного значения: " + indexMax);

    }

    //Task_4//
    public static void useNullElement() {

        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, введите рамер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива");
            array[i] = input.nextInt();
        }
        int zero = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                zero++;

            }
        }
        if (zero > 0) {
            System.out.println("Количество нулевы элементов: " + zero);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }

    //Task_5//
    public static void useReplace() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {

            System.out.println("Введите элемент массива");
            array[i] = input.nextInt();

        }
        for (int i = 0; i < size / 2; i++) {

            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
            System.out.println(temp);

        }
        for (int num : array) {
            System.out.print(num + " ");

        }
    }

    //Task_6//
    public static void isIncrease() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива");
            array[i] = input.nextInt();
        }
        boolean flag = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Является возрастающим");
        } else {
            System.out.println("Не является возрастающим");
        }
    }

    //Task_*//
    public static void useArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер  массива");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
            } else {
                array[i] = 0;
            }
        }
        for (int num : array) {
            System.out.print("Результат: "+num);
        }
    }
}






































