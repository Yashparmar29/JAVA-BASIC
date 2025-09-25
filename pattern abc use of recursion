import java.util.*;

public class pattern_abc 
{
    public static void pattern(String str,int idx,String newstr)
    {
        if(idx == str.length())
        {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        //to be continue
        pattern(str,idx+1,newstr + currchar);
        //or not be
        pattern(str,idx+1,newstr);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :- ");
        String name = sc.next();
        pattern_abc a = new pattern_abc();
        a.pattern(name,0,"");

    }    
}
