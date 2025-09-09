import java.util.Scanner;

public class while_loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = 0 ;

        while(i < no)
        {
            System.out.println(i+1);
            i++;
        }
    }    
}
