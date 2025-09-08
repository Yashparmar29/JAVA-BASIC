import java.util.Scanner;

public class sum_n_number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int no = sc.nextInt(); 

        int sum = 0;
        for(int n = 0 ; n <= no ; n++)
        {
            sum = sum + n ;
        }
        System.out.println(sum);
    }    
}
