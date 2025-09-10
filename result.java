import java.util.Scanner;

public class result
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter subject no :- ");
        int no = sc.nextInt();
        
        int marks[] = new int[no];

        System.out.println("------------------------------------------");

        for(int i=0 ; i<no ;i++)
        {
            System.out.print("enter marks subject" + i + ":- " );
            marks[i] = sc.nextInt();
        }
        for(int i=0 ; i<no ;i++)
        {
            System.out.println("enter marks subject" + i + ":- " + marks[i]);
        }
        int result = 0;
        for(int i=0 ;i<no ;i++)
        {
            result = result + marks[i];
        }
        System.out.println("your percanrage is :- " + result/no);
        System.out.println("------------------------------------------");        
        
            if(result>=33)
            {
                System.out.println("you can pass exam..... ");
            }
            else
            {
                System.out.println("you fell in the exam.....");
            }
        
    }    
}
