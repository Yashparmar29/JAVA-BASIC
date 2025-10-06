import java.util.Scanner;
public class pattern10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no you can print in this:- ");
        int no = sc.nextInt();
        for(int i=1 ; i<=no ; i++)
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print("*");
            }
            for(int k=no; k>=i ; k--)
            {
                System.out.print(" ");
            }
            for(int l=no ; l>i ; l--)
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
