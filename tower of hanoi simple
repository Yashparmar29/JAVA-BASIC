import java.util.Scanner;

class toh
{
    int source[] = new int[3];
    int dest[] = new int[3];
    int help[] = new int[3];

    toh(int no1,int no2,int no3)
    {
        source[0] = no1;
        source[1] = no2;
        source[2] = no3;
    }
    void first()
    {
        help[0] = source[2]; //value 3 go to help 0
        dest[0] = source[1];//value 2 go to dest 0
        help[1] = dest[0]; //value 2 go to help1
        System.out.println("first round work succeffully.");
    }
    void second()
    {
        dest[0] = source[0];// value 1 go to dest 0
        source[0] = help[1];//value 3 go to source 0
        dest[1] = source[0]; //value 2 go to dest 1
        dest[2] = help[0];//value 3 go to dest2
        for(int i=0;i<3;i++)
        {
            System.out.println(dest[i]);
        }
        System.out.println("destination value print.");
    }
    public static void main(String [] args)
    {
            int arr[] = new int[3];
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<3;i++)
            {
                System.out.print("enter no " + i + " :- ");
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("source value print.");
        toh t = new toh(arr[0], arr[1],arr[2]);
        t.first();
        t.second();
    }
}
