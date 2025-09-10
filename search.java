import java.util.Scanner;

public class search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();
        
        int array[] = new int[no];    
        for(int i=0 ; i<no ; i++)
        {
            System.out.print("enter no :- ");
            array[i] = sc.nextInt();
        }
        System.out.println("---result---");
        for(int i=0 ; i<no ; i++)
        {
            System.out.println("number :- " + array[i]);
        }
        System.out.println("---serch part---");
        System.out.println("find number :- ");
        int ch = sc.nextInt();

        for(int i=0 ; i<no ; i++)
        {
            if(array[i] == ch)
            {
                System.out.println("your choice is " + i);
            }
        }
    }
}
