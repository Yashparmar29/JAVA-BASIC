import java.util.Scanner;

class user_exception extends Exception
{
    public user_exception(String s)
    {
        super(s);
    }
}
class pass_exception extends Exception
{
    public pass_exception(String s)
    {
        super(s);
    }
}
public class user_pass 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter user id :- ");
        String userid = sc.next();
        System.out.print("enter password :- ");
        String pass = sc.next();
        try
        {
            if(!userid.equals("yash123"))
            {
                throw new user_exception("invalid user id");
            }
            else
            {
                System.out.println("hello " + userid);
            }
            if(!pass.equals("1235"))
            {
                throw new pass_exception("invalid password "); 
            }
            else
            {
                System.out.println("welcome " + userid);
            }
        }
        catch(user_exception e)
        {
            System.out.println(e.getMessage());
        }
        catch(pass_exception e)
        {
            System.out.println(e.getMessage());
        }
    }   
}
