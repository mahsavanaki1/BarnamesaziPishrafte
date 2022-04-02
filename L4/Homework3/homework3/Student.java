package homework3;

import java.util.LinkedList;
import java.util.List;

public class Student<T> {

    private String Fullname;
    private double StudentNumber;
    private String fatherName;
    private List<Double> grades;

    public Student() {
        grades = new LinkedList<>();
    }

    public Student(String Fullname, double StudentNumber, String fatherName) {
        this();
        setFullname(Fullname);
        setStudentNumber(StudentNumber);
        setFatherName(fatherName);
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public double getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(double StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        List<Double> list = getGrades();
        String marks = "\n";
        for (Double mark : list) {
            marks += mark + "\n";
        }
        return "Fullname : " + Fullname + ", StudentNumber : " + StudentNumber + ", fatherName : " + fatherName + ", grades : " + marks;
    }

}
