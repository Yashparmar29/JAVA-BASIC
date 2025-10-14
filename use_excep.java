import java.util.Scanner;

import excep.excep_class;
public class use_excep 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        int no = sc.nextInt();
        try
        {
            if(no < 10)
            {
                throw new excep_class("low number");
            }
        }
        catch(excep_class e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
