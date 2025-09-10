import java.util.Scanner;

public class print_num 
{
    public static void printnum(int n)
    {
        System.out.println(n);
        if(n == 1)
        {
            return;
        }
        printnum(n-1);
    }
    public static void main(String[] args)
    {
        System.out.print("enter no :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
    }   
}
