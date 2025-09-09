import java.util.Scanner;

public class loop1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int i,n;
        for(i=0;i<no1;i++)
        {
            for(n=0;n<=i-1;n++)
            {
                System.out.print("*");
            }
            System.out.print();
        }
    }    
}
