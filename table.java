import java.util.Scanner;

public class table 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int no = sc.nextInt();
        
        for(int i = 1 ; i <= 10 ; i++)
        {
            int mul = no * i ;
            System.out.println(no + "*" +  i + "=" + mul);
        }

    }    
}
