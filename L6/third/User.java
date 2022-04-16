package third;

public class User {
    private String id;
    private String name;
    private String entYear;
    private String gpa;

    public User(String id, String name, String entYear, String gpa) {
        this.id = id;
        this.name = name;
        this.entYear = entYear;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println(">> User");
        System.out.println("id: " + id + " name: " + name + " entYear: " + entYear + " gpa: " + gpa);
        System.out.println("<<<<<<<");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntYear() {
        return entYear;
    }

    public void setEntYear(String entYear) {
        this.entYear = entYear;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
}
