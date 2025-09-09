import java.util.Arrays;
import java.util.Scanner;

public class sorting_array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows :- ");
        int rows = sc.nextInt();
        System.out.print("enter number of cols :- ");
        int cols = sc.nextInt();
        System.out.println("----------------------------");
        
        int arr[][] = new int[rows][cols];

        for(int i =0 ; i<rows ; i++)
        {
            for(int j = 0 ; j<cols ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }       
        for(int i =0 ; i<rows ; i++)
        {
            for(int j = 0 ; j<cols ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        System.out.println("-----------------------------");
        
        for(int i=0; i<rows; i++)
        {
            for(int j=0;j<i;j++)
            {
                   
            }
        }
        for(int i =0 ; i<rows ; i++)
        {
            for(int j = 0 ; j<cols ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
               
    }
}
