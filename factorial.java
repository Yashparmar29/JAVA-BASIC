import java.util.Scanner;

public class factorial
{
    public static void fact(int a)
    {
        int result = 1;
        for(int i=a ; i>=1 ; i--)
        {
             result = result * i ;
        }    
        System.out.println("factorial no :- " + result);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a > 0)
        {
            fact(a);
        }
        else
        {
            System.out.println("you enter wrong number........");
        }
    }   
}
