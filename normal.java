import java.util.Scanner;

public class normal 
{
    
    public static void main(String[] args) 
    {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++)
        {
            System.out.print("enter marks :- ");
            marks[i] = sc.nextInt();
        }
        for(int i = 0 ; i<5 ; i++)
        {
            System.out.println("marks :- " + marks[i]);
        }
    } 
}
