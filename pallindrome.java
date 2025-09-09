import java.util.*;

public class pallindrome 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :- ");
        String name = sc.next();
        StringBuilder name1 = new StringBuilder(name);
        StringBuilder rev_name = new StringBuilder(name).reverse();

        if(name1.toString().equals(rev_name.toString()))
        {
            System.out.println("String is palindrome......");
        }
        else 
        {
            System.out.println("string is not palindrome....");
        }

                
    }    
}
