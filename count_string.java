import java.util.Scanner;
public class count_string 
{
    public static int first = -1;
    public static int last = -1; 
    
    public static void count(String str,int idx,char element)
    {
        if(idx == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currenchar = str.charAt(idx);
        if(currenchar == element)
        {
            if(first == -1)
            {
                first = idx;
            }
            else
            {
                last = idx;
            }                
        }
        count(str, idx+1, element);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        count(name,0,'y');
        sc.close();
    }
}
