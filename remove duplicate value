import java.util.*;

public class remove_duplicate 
{
    public static boolean map[] = new boolean[26];

    public static void dupl(String str,int idx,String newstr)
    {
        if(idx == str.length())
        {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true)
        {
            dupl(str,idx+1,newstr);
        }
        else
        {
            newstr += currchar;
            map[currchar - 'a'] = true;
            dupl(str, idx+1, newstr);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name :- ");
        String name = sc.next();
        remove_duplicate r = new remove_duplicate();
        r.dupl(name,0,"");

    }    
}
