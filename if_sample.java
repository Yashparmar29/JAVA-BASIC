import java.util.Scanner;

public class if_sample 
{
    public static void main(String[] args)
    {
        System.out.println("welcome to our company");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age>18)
        {
            System.out.println("you are adult");
        }
        else
        {
            System.out.println("you are not adult");
        }
    } 
}
