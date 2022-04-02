package Person;

public class Person {

    private String Name;
    private String Family;
    private int Age;
    private String Pass;
    private String Username;
    private String Job;

    public Person() {
    }

    public Person(String Name, String Family, int Age, String Pass, String Username, String Job) {
        setName(Name);
        setFamily(Family);
        setAge(Age);
        setPass(Pass);
        setUsername(Username);
        setJob(Job);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String Family) {
        this.Family = Family;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        if (Age < 0 || Age > 250) {
            this.Age = 0;
        } else {
            this.Age = Age;
        }
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    @Override
    public String toString() {
        return String.format("Name : %s, Family : %s, Age : %d, Pass : %s, Username : %s, Job : %s", getName(), getFamily(), getAge(), getPass(), getUsername(), getJob());
    }

}
