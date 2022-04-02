package homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinate=new Coordinate<>();
        Scanner input =new Scanner(System.in);

        coordinate.name=input.nextLine();
        coordinate.age=input.nextInt();
        coordinate.Id=input.nextInt();
        System.out.println(coordinate.name);
        System.out.println(coordinate.age);
        System.out.println(coordinate.Id);

        Coordinate obj=null;
        try {
            obj=(Coordinate) coordinate.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Invalid clone entered.");
        }
        if (!coordinate.equals(obj)){
            System.out.println(obj.Id);
            System.out.println(coordinate.Id);
            System.out.println(obj);
            System.out.println(coordinate);
        }
    }
}
