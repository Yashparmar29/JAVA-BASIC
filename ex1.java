// ques 1 :- Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class ex1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();
        
        String arr[] = new String[no];

        for(int i=0;i<no;i++)
        {
            System.out.print("enter name " + (i+1) + " :- ");
            arr[i] = sc.next();
        }
        for(int i=0;i<no;i++)
        {
             System.out.println("name " + (i+1) + " :- " + arr[i]);
        }
    }
}
