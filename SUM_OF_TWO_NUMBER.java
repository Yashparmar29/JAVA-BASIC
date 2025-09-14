import java.util.Scanner;

public class SUM_OF_TWO_NUMBER
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows :- ");
        int rows = sc.nextInt();
        System.out.print("enter cols :- ");
        int cols = sc.nextInt();
        
        //matrics 1 :- 

        int arr[][] = new int[rows][cols];
        System.out.println("matrics 1:- ");
        //get value for user ask
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("enter arr[" + i + "][" + j + "] :- ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // print value asking for user
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //martics no 2:- 

        int matrics2[][] = new int[rows][cols];

         //get value for user ask
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("enter matrics[" + i + "][" + j + "] :- ");
                matrics2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // print value asking for user
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(matrics2[i][j] + " ");
            }
            System.out.println();
        }

        //sum of two matrics 
        System.out.println("sum of two matrics .....");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print((arr[i][j] + matrics2[i][j]) + " ");
            }
            System.out.println();
        }
    }    
}
