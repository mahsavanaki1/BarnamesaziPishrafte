package Emtiazi;

public class UserBuilder {
    private static UserBuilder instanceC = null;

    public static UserBuilder getInstance() {
        if(instanceC == null)
            return new UserBuilder();
        else
            return instanceC;
    }

    public User buildUser(String username, String id, String password, String age) {
        User user = new User();
        user.setUsername(username);
        user.setId(id);
        user.setPassword(password);
        user.setAge(age);
        System.out.println("User Information");
        System.out.println("username: " + user.getUsername());
        System.out.println("id: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        System.out.println("age: " + user.getAge());
        System.out.println("----------------------------");
        return user;
    }
}