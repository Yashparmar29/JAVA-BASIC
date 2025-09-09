import java.util.Scanner;

public class do_while 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = 0 ;
        do
        {
            System.out.println(i+1);
            i++;
        }
        while(i < no);
    }    
}
