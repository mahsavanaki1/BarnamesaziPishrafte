package first;

public class User {
    private String id;
    private String username;
    private String email;
    private String password;
    private String age;
    private String education;

    public User(String id, String username, String email, String password, String age, String education) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.education = education;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void print() {
        System.out.println(">> first.User");
        System.out.println("id: " + id + " username: " + username + " email: " + email + " password: " + password + " age: " + age + " education: " + education);
        System.out.println("<<<<<<<<");
    }
}
