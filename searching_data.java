import java.util.Scanner;

public class searching_data 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Rows :- ");
        int rows = sc.nextInt();
        System.out.print("enter cols :- ");
        int cols = sc.nextInt();

        String arr[][] = new String[rows][cols];

         for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<cols ; j++)
            {
                arr[i][j] = sc.next();
            }
        }   
        System.out.println("----------------------------------------------");
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<cols ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----searching part----");
        System.out.print("enter name :- ");
        String ch = sc.next();
        
        boolean found = false ;
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<cols ; j++)
            {
                if(arr[i][j].equals(ch))
                {
                    System.out.println(arr[i][j] + " rows :- " + i + "   columns :- " + j);
                    found = true;

                }
            }
        }
    }    
}
