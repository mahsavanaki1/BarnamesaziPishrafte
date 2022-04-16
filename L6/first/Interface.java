package first;

import first.Database;

import java.util.Scanner;

public class Interface {
    private static Database data = Database.getInstance();

    public static void interpretShowUser() {
        System.out.println("Enter the id of the user.");
        Scanner s = new Scanner( System.in );
        String id = s.nextLine();
        User user = data.get(id);
        if(user == null) {
            System.out.println("first.User not found");
            return;
        }
        user.print();
    }

    public static void interpretUpdateUser() {
        System.out.println("Enter the id of the user you want to update.");
        Scanner s = new Scanner( System.in );
        String id = s.nextLine();
        User user = data.get(id);
        if(user == null) {
            System.out.println("first.User not found");
            return;
        }
        System.out.println("Enter new data if you want to change the field, unless enter a \'-\'.");

        System.out.println("username:");
        String username = s.nextLine();
        if(username.equals("-"))
            username = user.getUsername();

        System.out.println("email:");
        String email = s.nextLine();
        if(email.equals("-"))
            email = user.getEmail();

        System.out.println("password:");
        String password = s.nextLine();
        if(password.equals("-"))
            password = user.getPassword();

        System.out.println("age:");
        String age = s.nextLine();
        if(age.equals("-"))
            age = user.getAge();

        System.out.println("education:");
        String education = s.nextLine();
        if(education.equals("-"))
            education = user.getEducation();

        User upUser = new User(id, username, email, password, age, education);
        data.edit(upUser);
        System.out.println("first.User Updated.");
    }

    public static void interpretAddUser() {
        System.out.println("Enter first.User Information In the following order in each line: id, username, email, password, age, education");
        Scanner s = new Scanner( System.in );

        String id = s.nextLine();
        String username = s.nextLine();
        String email = s.nextLine();
        String password = s.nextLine();
        String age = s.nextLine();
        String education = s.nextLine();

        User user = new User(id, username, email, password, age, education);
        boolean result = data.add(user);
        if(result)
            System.out.println("first.User Added.");
        else
            System.out.println("Error: Duplicated ID");
    }

    private static boolean interpret() {
        System.out.println("Enter your command:");
        System.out.println("1. add user");
        System.out.println("2. update user");
        System.out.println("3. show user");
        System.out.println("4. exit");

        Scanner myInput = new Scanner( System.in);
        int cmd = myInput.nextInt();
        switch (cmd) {
            case 1:
                interpretAddUser();
                break;
            case 2:
                interpretUpdateUser();
                break;
            case 3:
                interpretShowUser();
                break;
            case 4:
                return false;
            default:
                System.out.println("Wrong Command!");
        }
        return true;
    }

    public static void main(String[] args) {
        boolean cont = true;
        while(cont) {
            cont = interpret();
        }
    }
}
