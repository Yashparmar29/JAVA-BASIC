import java.util.Scanner;

public class print_num_1_to_5 
{
    public static void printnum(int m)
    {
        System.out.println(m);
        if(m == 9)
        {
            return;
        }
        printnum(m+1);

    }
    public static void main(String[] args)
    {
        
        int m = 1;
        printnum(m);
    }    
}
