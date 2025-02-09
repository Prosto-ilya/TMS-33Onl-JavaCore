package lesson_14_homework.Validation;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Validation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к входному файлу: ");
        String inputFilePath = scanner.nextLine();

        List<String> validDocuments = new ArrayList<>();
        List<String> invalidDocuments = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFilePath));
            for (String line : lines) {
                String docNumber = line.trim();
                if (isValidDocumentNumber(docNumber)) {
                    validDocuments.add(docNumber);
                } else {
                    String reason = "Должен содержать 15 символов и начинаться с 'docnum' или 'contract'";
                    invalidDocuments.add(docNumber + " - " + reason);
                }
            }

            Files.write(Paths.get(
                    "C:\\Java_homework\\Lesson3_Homework\\src\\Lesson_14_homework\\Validation\\valid_document.txt"),
                    validDocuments);
            Files.write(Paths.get(
                    "C:\\Java_homework\\Lesson3_Homework\\src\\Lesson_14_homework\\Validation\\invalid_document.txt"),
                    invalidDocuments);

            System.out.println("Обработка завершена. Результаты записаны.");
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
        }

    }
    private static boolean isValidDocumentNumber(String docNumber) {
        return docNumber.length() == 15 &&
                (docNumber.startsWith("docnum") || docNumber.startsWith("contract"));
    }
}
