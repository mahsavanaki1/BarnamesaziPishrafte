package Homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    static ArrayList<User> users = new ArrayList<User>();

    public static void addUser() {
        System.out.println("Enter Information for the User: username, name, password, age, address, phone, education");
        Scanner s = new Scanner(System.in);
        String username = s.nextLine();
        String name = s.nextLine();
        String password = s.nextLine();
        String age = s.nextLine();
        String address = s.nextLine();
        String phone = s.nextLine();
        String education = s.nextLine();

        User user = new User(username, name, password, age, address, phone, education);
        System.out.println("User Information");
        System.out.println("username: " + user.getUsername());
        System.out.println("name: " + user.getName());
        System.out.println("password: " + user.getPassword());
        System.out.println("age: " + user.getAge());
        System.out.println("address: " + user.getAddress());
        System.out.println("phone: " + user.getPhone());
        System.out.println("education: " + user.getEducation());
        System.out.println("----------------------------");

        users.add(user);
    }
    public static void main(String[] args) {
        while(true) {
            addUser();
        }
    }
}