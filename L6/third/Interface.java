package third;

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
        Scanner s = new Scanner(System.in);
        String id = s.nextLine();
        User user = data.get(id);
        if(user == null) {
            System.out.println("User not found");
            return;
        }
        data.remove(id);
        System.out.println("User removed.");
    }

    public static void interpretUpdateUser() {
        System.out.println("Enter the id of the user you want to update.");
        Scanner s = new Scanner( System.in );
        String id = s.nextLine();
        User user = data.get(id);
        if(user == null) {
            System.out.println("User not found");
            return;
        }
        System.out.println("Enter new data if you want to change the field, unless enter a \'-\'.");

        System.out.println("name:");
        String name = s.nextLine();
        if(name.equals("-"))
            name = user.getName();

        System.out.println("entYear:");
        String entYear = s.nextLine();
        if(entYear.equals("-"))
            entYear = user.getEntYear();

        System.out.println("gpa:");
        String gpa = s.nextLine();
        if(gpa.equals("-"))
            gpa = user.getGpa();

        User upUser = new User(id, name, entYear, gpa);
        data.edit(upUser);
        System.out.println("User Updated.");
    }

    public static void interpretAddUser() {
        System.out.println("Enter User Information In the following order in each line: id, name, entYear, gpa.");
        Scanner s = new Scanner( System.in );

        String id = s.nextLine();
        String name = s.nextLine();
        String entYear = s.nextLine();
        String gpa = s.nextLine();

        User user = new User(id, name, entYear, gpa);
        boolean result = data.add(user);
        if(result)
            System.out.println("User Added.");
        else
            System.out.println("Error: Duplicated ID");
    }

    private static boolean interpret() {
        System.out.println("Enter your command:");
        System.out.println("1. add user");
        System.out.println("2. update user");
        System.out.println("3. remove user");
        System.out.println("4. show user");
        System.out.println("5. exit");

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
                interpretRemoveUser();
                break;
            case 4:
                interpretShowUser();
                break;
            case 5:
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

