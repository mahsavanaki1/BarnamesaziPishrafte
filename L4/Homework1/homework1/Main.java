package homework1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Map<String, Object> map = new LinkedHashMap<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Student Fullname please: ");
            String fullname = scanner.nextLine();
            System.out.print("Enter Student Number please: ");
            double studentNumber = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Student Average please: ");
            double average = Double.parseDouble(scanner.nextLine());

            if (fullname.length() < 3) {
                fullname = "Invalid Entered!";
            }

            if (studentNumber < 0) {
                studentNumber = 0;
            }

            if (average < 0 || average > 20) {
                average = 0;
            }

            map.put("fullname", fullname);
            map.put("studentNumber", studentNumber);
            map.put("average", average);

            System.out.println("---------------------------------------------------");
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (NumberFormatException e) {
            System.out.println("\nError Happend Please try Again :(");
            System.out.print("Error Message: ");
            System.out.println(e.getMessage());
        }
    }

}
