package bhavik;

import java.util.Scanner;

public class two 
{
    Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String arr[] = new String[no];
        int marks[] = new int[no];
    public void sub()
    {
        for(int i=0;i<no;i++)
        {
            System.out.print("enter subject :- ");
            arr[i] = sc.next();
            System.out.print("enter marks :- ");
            marks[i] = sc.nextInt();
        }
    }
    public void show()
    {
        for(int i=0;i<no;i++)
        {
            System.out.println(arr[i] +" :-" + marks[i]);
        }
    }
}
