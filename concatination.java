// cocatination means you can join two or more string in one variable using + operator
import java.util.Scanner;

public class concatination 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first name :- ");
        String fname = sc.next();
        System.out.print("enter last name :- ");
        String lname = sc.next();

        String full = fname + " " + lname ;
        System.out.println("name :- " + full);
        System.out.println("name :- " + full.length());
    }
}
