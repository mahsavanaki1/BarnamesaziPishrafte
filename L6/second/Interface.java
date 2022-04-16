package second;

import java.util.Scanner;

public class Interface {
    private static Database data = Database.getInstance();

    public static void interpretShowUser() {
        System.out.println("Enter the id of the user.");
        Scanner s = new Scanner( System.in );
        String id = s.nextLine();
        User user = data.get(id);
        if(user == null) {
            System.out.println("User not found");
            return;
        }
        user.print();
    }

    public static void interpretRemoveUser() {
        System.out.println("Enter the id of the user.");
        Scanner s = new Scanner( System.in );
        String id = s.nextLine();
        User user = data.get(id);
        if(user == null) {
            System.out.println("User not found");
            return;
        }
        data.remove(id);
        System.out.println("User removed.");
    }

    public static void interpretAddUser() {
        System.out.println("Enter User Information In the following order in each line: id, name, melli, fName, appointment, salary, background.");
        Scanner s = new Scanner( System.in );

        String id = s.nextLine();
        String name = s.nextLine();
        String melli = s.nextLine();
        String fName = s.nextLine();
        String appointment = s.nextLine();
        String salary = s.nextLine();
        String background = s.nextLine();

        User user = new User(id, name, melli, fName, appointment, salary, background);
        boolean result = data.add(user);
        if(result)
            System.out.println("User Added.");
        else
            System.out.println("Error: Duplicated ID");
    }

    private static boolean interpret() {
        System.out.println("Enter your command:");
        System.out.println("1. add user");
        System.out.println("2. remove user");
        System.out.println("3. show user");
        System.out.println("4. exit");

        Scanner myInput = new Scanner( System.in);
        int cmd = myInput.nextInt();
        switch (cmd) {
            case 1:
                interpretAddUser();
                break;
            case 2:
                interpretRemoveUser();
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
