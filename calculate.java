import java.util.Scanner;

public class calculate
{
    public static void sum(int a,int b) 
    {
        int result = a + b ;
        System.out.println("sum :- " + result);   
    }
    public static void sub(int a,int b)
    {
        int result = a - b ;
        System.out.println("multiplication :- " + result);   
    }
    public static void mul(int a,int b)
    {
        int result = a * b ;
        System.out.println("subtraction :- " + result);   
    }
    public static void div(int a,int b)
    {
        float result = a / b ;
        System.out.println("division :- " + result);   
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no1 :- ");
        int no1 = sc.nextInt();
        System.out.print("enter no2 :- ");
        int no2 = sc.nextInt();
        
        System.out.println("your choice :- ");
        System.out.println("1.sum");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.div");

        int choice = sc.nextInt();

        if(choice == 1)
        {
            sum(no1,no2);
        }
        else if(choice == 2)
        {
            sub(no1,no2);
        }
        else if(choice == 3)
        {
            mul(no1,no2);
        }
        else if(choice == 4)
        {
            div(no1,no2);
        }


    }
}
