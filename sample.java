import java.util.Scanner;

public class sample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows :- ");
        int rows = sc.nextInt();
        System.out.print("enter rows :- ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<cols ; j++)
            {
                System.out.print("enter no " + i + j + " :- ");
                arr[i][j] = sc.nextInt();
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
    }    
}
