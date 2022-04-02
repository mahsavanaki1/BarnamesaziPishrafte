package homework3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            List<Double> grades = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Student Fullname please: ");
            String fullname = scanner.nextLine();
            System.out.print("Enter Student Number please: ");
            double studentNumber = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Student Father Name please: ");
            String fatherName = scanner.nextLine();
            Student student = new Student(fullname, studentNumber, fatherName);

            for (int i = 1; i <= 5; i++) {
                System.out.printf("Enter %d-th grade please: ", i);
                grades.add(Double.parseDouble(scanner.nextLine()));
            }

            student.setGrades(grades);

            System.out.println(student);
        } catch (NumberFormatException e) {
            System.out.println("\nError Happend Please try Again :(");
            System.out.print("Error Message: ");
            System.out.println(e.getMessage());
        }
    }

}
