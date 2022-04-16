package second;

public class User {
    private String id;
    private String name;
    private String melli;
    private String fName;
    private String appointment;
    private String salary;
    private String background;

    public User(String id, String name, String melli, String fName, String appointment, String salary, String background) {
        this.id = id;
        this.name = name;
        this.melli = melli;
        this.fName = fName;
        this.appointment = appointment;
        this.salary = salary;
        this.background = background;
    }

    public void print() {
        System.out.println(">> User");
        System.out.println("id: " + id + " name: " + name + " melli: " + melli + " fName: " +
                fName + " appointment: " + appointment + " salary: " + salary + " background: " + background);
        System.out.println("<<<<<<<<");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

