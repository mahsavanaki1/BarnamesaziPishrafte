package first;

import java.util.ArrayList;

public class Database {
    private static Database theInstance = null;
    private static ArrayList<User> users = new ArrayList<User>();

    public static Database getInstance() {
        if (theInstance == null)
            theInstance = new Database();
        return theInstance;
    }

    public static boolean add(User user) {
        for(User us : users)
            if(us.getId().equals(user.getId()))
                return false;
        users.add(user);
        return true;
    }

    public static User get(String id) {
        for(User us : users)
            if(us.getId().equals(id))
                return us;
        return null;
    }

    public static boolean remove(String id) {
        for(User us : users)
            if(us.getId().equals(id)) {
                users.remove(us);
                return true;
            }
        return false;
    }

    public static boolean edit(User user) {
        boolean found = false;
        for(User us : users) {
            if(us.getId().equals(user.getId())) {
                users.remove(us);
                users.add(user);
                return true;
            }
        }
        return false;
    }
}
