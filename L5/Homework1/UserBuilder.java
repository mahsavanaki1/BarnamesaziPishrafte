package Homework1;

public class UserBuilder {
    private static UserBuilder instanceC = null;

    public static UserBuilder getInstance() {
        if(instanceC == null)
            return new UserBuilder();
        else
            return instanceC;
    }

    public static User buildUser(String username, String name, String password, String age, String address, String phone, String education) {
        User user = new User();
        user.setUsername(username);
        user.setName(name);
        user.setPassword(password);
        user.setAge(age);
        user.setAddress(address);
        user.setPhone(phone);
        user.setEducation(education);
        System.out.println("User Information");
        System.out.println("username: " + user.getUsername());
        System.out.println("name: " + user.getName());
        System.out.println("password: " + user.getPassword());
        System.out.println("age: " + user.getAge());
        System.out.println("address: " + user.getAddress());
        System.out.println("phone: " + user.getPhone());
        System.out.println("education: " + user.getEducation());
        System.out.println("----------------------------");
        return user;
    }
}