import java.util.Scanner;
public class reverse 
{
    public static void reverse_str(String n,int idx)
    {
        if(idx == 0)
        {
            System.out.println(n.charAt(idx));
            return;
        }
         System.out.println(n.charAt(idx));
         reverse_str(n,idx-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter String :- ");
        String name = sc.next();

        reverse_str(name,(name.length()-1));

    }    
}
