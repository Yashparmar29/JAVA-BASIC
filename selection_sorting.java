import java.util.Scanner;
public class selection_sorting 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number that can you add :- ");
        int no = sc.nextInt();
        int arr[] = new int[no];

        for(int i=0;i<no;i++)
        {
            System.out.print("enter arr[" + (i+1) + "] :- ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<no;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
        System.out.println("----------------------");
        System.out.println("1.ascending order.....");
        System.out.println("2.descending order.....");

        System.out.print("enter choice :- ");
        int ch = sc.nextInt();
        if(ch == 1)
        {
            for(int i=0;i<no-1;i++)
            {
                int smallest = i;
                for(int j=i+1;j<no;j++)
                {
                    if(arr[smallest]>arr[j])
                    {
                        smallest = j;
                    }
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        else
        {
            for(int i=0;i<no-1;i++)
            {
               int smallest = i;
                for(int j=i+1;j<no;j++)
                {
                    if(arr[smallest]<arr[j])
                    {
                        smallest = j;
                    }
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<no;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    
}
