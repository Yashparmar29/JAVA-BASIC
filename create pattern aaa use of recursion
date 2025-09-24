import java.util.HashSet;
import java.util.Scanner;

import javax.lang.model.util.SimpleElementVisitor14;
import java.util.HashSet;

public class pattern_aaa
{
    public static void pattern(String str,int idx,String newstr,HashSet<String> set)
    {
        if(idx == str.length())
        {
            if(set.contains(newstr))
            {
                return;
            }
            else
            {
                System.out.println(newstr);
                set.add(newstr);
            }
        }
        char currchar = str.charAt(idx);
        //to be continue
        pattern(str,idx+1,newstr + str.charAt(idx),set);
        //or not be
        pattern(str,idx+1,newstr,set);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :- ");
        String name = sc.next();
        HashSet<String> set = new HashSet<>(); 
        pattern_aaa a = new pattern_aaa();
        a.pattern(name,0,"",set);
    }
}
