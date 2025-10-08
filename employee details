import java.util.*;
public class emp
{
    Scanner sc = new Scanner(System.in);
    int emp_no;
    String emp_name;
    String emp_class,designation;

    //you can user to input
    void get()
    {
        System.out.print("enter emp no :- ");
        emp_no = sc.nextInt();
        System.out.print("enter emp name :- ");
        emp_name = sc.next();
        System.out.println("1 -> class 1");
        System.out.println("1 -> class 2");
        System.out.println("1 -> class 3");
        System.out.print("enter class :- ");
        int ch = sc.nextInt();
        if(ch == 1)
        {
            emp_class = "class 1";
        }
        else if(ch == 2)
        {
            emp_class = "class 2";
        }
        else 
        {
            emp_class = "class 3";
        }
        System.out.print("enter designation :- ");
        designation = sc.next();
    }
}

public class emp_details 
{
    public static void main(String[] args)
    {
        emp e[] = new emp[5];
        for(int i=0;i<5;i++)
        {
            e[i] = new emp();
            e[i].get();
        }
    }    
}
