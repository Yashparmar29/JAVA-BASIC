import java.util.Scanner;

class a extends Thread
{
    int no;
    a(int no)
    {
        this.no = no;
    }
    public void run()
    {
        System.out.println("Start Thread :- " + Thread.currentThread().getName());
        for(int i=0;i<no;i++)
        {
            try
            {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + " :- " + (i+1));

            }
            catch(Exception e)
            {
                System.out.println("Error ....");
            }
        }
        System.out.println("End Thread :- " + Thread.currentThread().getName());
    }
}
class b extends Thread
{
    int no;
    b(int no)
    {
        this.no = no;
    }
    public void run()
    {
        System.out.println("Start Thread :- " + Thread.currentThread().getName());
        for(int i=0;i<no;i++)
        {
            try
            {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + " :- " + (i+1));

            }
            catch(Exception e)
            {
                System.out.println("Error ....");
            }
        }
        System.out.println("End Thread :- " + Thread.currentThread().getName());
    }
}
public class with_join 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no :- ");
        int no = sc.nextInt();
        System.out.println("1 -> Thread a first and after Thread b");
        System.out.println("2 -> Thread b first and after Thread a");
        System.out.print("enter choice :- ");
        int ch = sc.nextInt();
        try
        {
            if(ch == 1)
            {
                a aobj = new a(no);
                aobj.setName("Thread A");
                aobj.start();
                aobj.join();
                b bobj = new b(no);
                bobj.setName("Thread B");
                bobj.start();
            }
            else if(ch == 2)
            {
                b bobj = new b(no);
                bobj.setName("Thread B");
                bobj.start();
                bobj.join();
                a aobj = new a(no);
                aobj.setName("Thread A");
                aobj.start();
                aobj.join();
            }
        }
        catch(Exception e)
        {
            System.out.println("Error....");
        }
    }    
}
