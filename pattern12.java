import java.util.Scanner;
public class pattern12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();
        int number = 1 ;
        for(int i=1 ; i<=no ; i++)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(number);
                number++;
            }
            System.out.println("");
        }
        for(int i=no-1 ; i<=1 ; i--)
        {
            for(int j=i ;j>=i ; j--)
            {
                System.out.print(number);
                number++;
            }
            System.out.print("");
        }
    }
}
