import java.util.Scanner;
public class sorted_array
{
    public static boolean create(int arr[],int idx)
    {
        if(idx == arr.length-1)
        {
            return true;
        }

        if(arr[idx] < arr[idx + 1])
        {
            return create(arr,idx+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("enter " + i + " :- ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println(create(arr,0));
    }    
}
