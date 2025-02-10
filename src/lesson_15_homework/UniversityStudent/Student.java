package lesson_15_homework.UniversityStudent;

public class Student {
   private final String name;
    private final String studyGroup;
    private int course;
    private final double averageMark;

    public Student(String name, String group, int course, double averageMark){
        this.name = name;
        this.studyGroup =group;
        this.course = course;
        this.averageMark = averageMark;
    }
    public String getName(){
        return name;
    }
    public String getStudyGroup(){
        return studyGroup;

    }
    public double getAverageMark(){
        return averageMark;
    }
    public void promotion(){
        course++;
    }

    public int getCourse() {
        return course;
    }


}

