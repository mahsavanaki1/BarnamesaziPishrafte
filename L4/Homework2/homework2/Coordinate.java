package homework2;

public class Coordinate<first,second,third> implements Cloneable {
    public first name;
    public second age;
    public third Id;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}