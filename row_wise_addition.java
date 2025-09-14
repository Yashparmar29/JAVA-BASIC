import java.util.Scanner;

public class row_wise_addition
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

        //row wise addition
        int sum[] = new int[rows];
        
        for(int i=0;i<rows;i++)
        {
            sum[i] = 0;
             for(int j=0;j<cols;j++)
             {
                 if(j<cols)
                 {
                    sum[i] += arr[i][j];
                 }
             }
        }

        for(int i=0;i<rows;i++)
        {
            System.out.println(sum[i]);
        }
    }
}