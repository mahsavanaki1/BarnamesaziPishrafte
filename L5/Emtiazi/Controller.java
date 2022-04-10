package Emtiazi;

import java.util.regex.Pattern;

public class Controller {
    private static Controller instanceC = null;

    public static Controller getInstance() {
        if(instanceC == null)
            return new Controller();
        else
            return instanceC;
    }

    public boolean checkInfo(String username, String id, String password, String age) {
        boolean b1 = checkUsername(username);
        boolean b2 = checkId(id);
        boolean b3 = checkPass(password);
        boolean b4 = checkAge(age);
//        System.out.println(Boolean.toString(b1) + Boolean.toString(b2) + Boolean.toString(b3) + Boolean.toString(b4));
        return b1 & b2 & b3 & b4;
    }

    public boolean checkUsername(String username) {
        return Pattern.compile("[a-zA-Z]+").matcher(username).matches();
    }

    public boolean checkPass(String password) {
        boolean hasSpace = password.contains(" ");
        boolean longerT8 = password.length() <= 8;
        return hasSpace | longerT8;
    }

    public boolean checkAge(String age) {
        if(!Pattern.compile("[0-9]+").matcher(age).matches())
            return false;
        int agei = Integer.parseInt(age);
        if(agei <= 0)
            return false;
        return true;
    }

    public boolean checkId(String id) {
        if(!Pattern.compile("[0-9]+").matcher(id).matches())
            return false;
        if(id.length() <= 9)
            return false;
        return true;
    }
}