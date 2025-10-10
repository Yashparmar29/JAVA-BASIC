import java.util.*;
class email_exep1 extends Exception
{
    public email_exep1(String s)
    {
        super(s);
    }
}
class email_get
{
    String email;
    email_get(String email)
    {
        this.email = email;
    }
    void display() throws email_exep1
    {
        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i) >= 'A' && email.charAt(i) <= 'Z')
            {
                throw new email_exep1("invalid Email" + email);
            }
            else if(!email.contains("@"))
            {
                throw new email_exep1("invalid Email" + email);
            }
            else if(!email.contains(".com"))
            {
                throw new email_exep1("invalid Email" + email);
            }
            else
            {
                System.out.println("hello     " + email);
                break;
            }
        }
    }

}
public class email_exep 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Email :- ");
        String email = sc.next();
        email_get g = new email_get(email);
        try
        {
            g.display();
        }
        catch(email_exep1 e)
        {
            System.out.println(e.getMessage());
        }
    }
}
