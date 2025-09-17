import java.util.*;
class ex_throw
{
    int num1,num2,ch;
    void get() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num 1 :- ");
        num1 = sc.nextInt();
        System.out.print("enter num 2 :- ");
        num2 = sc.nextInt();
        System.out.println("----- choice -----");
        System.out.println("1 -> sum");
        System.out.println("2 -> subtraction");
        System.out.println("3 -> mulplication");
        System.out.println("4 -> division");
        System.out.print("enter choice :- ");
        ch = sc.nextInt();
        calc();
    }
    void calc() throws Exception
    {
        switch (ch)
        {
            case 1:
                System.out.println("sum :- " + (num1 + num2));
                break;
            case 2:
                System.out.println("sub :- " + (num1 - num2));
                break;
            case 3:
                System.out.println("mul :- " + (num1 * num2));
                break;
            case 4:
                System.out.println("div :- " + (num1 / num2));
                //if you can add exception in inside the function
                /* 
                try
                {   
                    int num = num1 / num2;
                    System.out.println("div :- " + num);
                }
                catch(ArithmeticException e)
                {
                    //Scanner sc = new Scanner(System.in);
                    System.out.println("you can enter number is 0");
                    System.out.println("if you can agree then restart");
                    System.out.print("enter choice for restart yes then 1 or no then 2 :-");
                    int choice = sc.nextInt();
                    if(choice == 1)
                    {
                        get();
                    }
                    else
                    {
                        System.exit(0);
                    }
                    throw e;
                }
                finally
                {
                    System.exit(0);
                }*/
                break;
            default:
                System.out.println("Enter valid choice......");
                break;
        }        
    }

}
public class throw_keyword 
{
    public static void main(String[] args)
    {
        ex_throw a = new ex_throw();
        try
        {
            a.get();
        }
        catch(Exception e)
        {
            System.out.println("outsider exception");
        }
    }    
}
