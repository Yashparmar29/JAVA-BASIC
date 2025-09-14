import java.util.Scanner;

public class mul_of_two_matrics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows for matrics 1 :- ");
        int rows = sc.nextInt();
        System.out.print("enter cols for matrics 1 :- ");
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

        System.out.print("enter rows for matrics 2 :- ");
        int rows1 = sc.nextInt();
        System.out.print("enter cols for matrics 2 :- ");
        int cols1 = sc.nextInt();
        int matrics2[][] = new int[rows][cols];

         //get value for user ask
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<cols1;j++)
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

        if(cols == rows1)
        {
            System.out.println("sum of two matrics .....");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    System.out.print((arr[i][j] * matrics2[i][j]) + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("your matrics are not possible to multiplication");
        }
    }    
}
