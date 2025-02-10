package lesson_15_homework.UniversityStudent;

public class MyMain {
    public static void main(String[] args) {
        StudentsCollection studentsCollection = new StudentsCollection();
        studentsCollection.addStudents(new Student("Ivan", "IA", 1, 8.5));
        studentsCollection.addStudents(new Student("Maria", "IA", 1, 2.4));
        studentsCollection.iterationStudents();
        studentsCollection.printStudents(2);

    }
}
