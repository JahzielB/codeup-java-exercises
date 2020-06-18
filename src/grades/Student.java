package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrades;

    public Student(String studentName) {
        this.studentName = studentName;
        studentGrades = new ArrayList<>();
    }

    public String getName() {
        return studentName;
    }

    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    public double getGradeAverage() {
        double numberOfGrades = studentGrades.size();
        double totalGrades = 0;
        for (Integer studentGrade : studentGrades) {
            totalGrades += studentGrade;
        }
        return totalGrades / numberOfGrades;
    }
}
