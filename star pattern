import java.util.Scanner;

public class butterfly_pattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();

        for(int i=1 ; i<=no ; i++)//upper part
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print("*");
            }
            int space = 2 * (no-i);
            for(int l=1 ;l<=space ; l++)
            {
                System.out.print(" ");
            }
            for(int m=0 ; m<i ; m++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=no ; i>=1 ; i--)//lower part
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print("*");
            }
            int space = 2 * (no-i);
            for(int l=1 ;l<=space ; l++)
            {
                System.out.print(" ");
            }
            for(int m=0 ; m<i ; m++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }    
}
