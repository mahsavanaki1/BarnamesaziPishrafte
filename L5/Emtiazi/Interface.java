package Emtiazi;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    private static ArrayList<User> users = new ArrayList<User>();
    public static void addUser() {
        System.out.println("Enter the information in each line. username, id, password, age");
        Scanner s = new Scanner(System.in);
        String username = s.nextLine();
        String id = s.nextLine();
        String password = s.nextLine();
        String age = s.nextLine();

        Controller controller = Controller.getInstance();
        boolean checkResults = controller.checkInfo(username, id, password, age);
        if(!checkResults)
            System.out.println("checks failed at controller");
        else {
            User newUser = UserBuilder.getInstance().buildUser(username, id, password, age);
            users.add(newUser);
        }
    }
    public static void main(String[] args) {
        while(true) {
            addUser();
        }
    }
}