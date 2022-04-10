package Homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    static ArrayList<User> users = new ArrayList<User>();
    public void addUser() {
        System.out.println("Enter User Information: username, name, password, age, address, phone, education");
        Scanner s = new Scanner(System.in);
        String username = s.nextLine();
        String name = s.nextLine();
        String password = s.nextLine();
        String age = s.nextLine();
        String address = s.nextLine();
        String phone = s.nextLine();
        String education = s.nextLine();

        User newUser = UserBuilder.buildUser(username, name, password, age, address, phone, education);
        users.add(newUser);
    }
}
