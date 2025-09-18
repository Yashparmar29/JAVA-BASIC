import java.util.Scanner;

class base
{
    Scanner sc = new Scanner(System.in);
    int a,b;
    base()
    {
        System.out.println("enter no 1 :- ");
        a = sc.nextInt();
        System.out.println("enter no 2 :- ");
        b = sc.nextInt();
        show();
    }
    void show()
    {
        try
        {
            int no = a/b;
            System.out.println("no :- " + no);
        }
        catch(ArithmeticException e)
        {
            System.out.println("you have entered 0");
            throw e;
        }
    }
}
class derive extends base
{
    base b = new base();
    derive()
    {
        System.out.println("this is derive class constructor");
    }
}
public class sample_1 
{
    public static void main(String[] args)
    {
        derive d = new derive();
    }    
}
