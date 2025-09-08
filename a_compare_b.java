import java.util.*;
public class a_compare_b 
{
    public static void main(String[] args)
    {
        Scanner no1 = new Scanner(System.in);
        int a = no1.nextInt();
        Scanner no2 = new Scanner(System.in);
        int b = no2.nextInt();

        if(a == b)
        {
            System.out.println("A is equal to b");
        }
        else if(a < b)
        {
            System.out.println("A is smaller than B");
        }
        else
        {
            System.out.println("A is bigger than B");
        }
    }
}
