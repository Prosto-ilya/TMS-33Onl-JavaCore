package lesson_15_homework.UniversityStudent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsCollection {

    private final List<Student> students;

    public StudentsCollection() {
        students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void iterationStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageMark() < 3) {
                iterator.remove();
            } else {
                student.promotion();
            }
        }
    }

    public void printStudents(int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
