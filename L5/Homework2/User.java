package Homework2;

public class User {
    private String username;
    private String name;
    private String password;
    private String age;
    private String address;
    private String phone;
    private String education;


    public User(String username, String name, String password, String age, String address, String phone, String education) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.education = education;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}