import java.util.*;
public class adding_character_in_last 
{
    public static void moveallx(String str,int idx,int count,String newstr)
    {
        if(idx == str.length())
        {
            for(int i=0;i<count;i++)
            {
                newstr += "x" ;
            }
            System.out.println("new string :- " + newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x')
        {
            count++;
            moveallx(str, idx+1, count, newstr);
        }
        else
        {
            newstr += currchar;
            moveallx(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        adding_character_in_last a = new adding_character_in_last();
        a.moveallx(name, 0, 0,"");

    }    
}
