import java.util.*;
class a extends Thread
{
	int no;
	a(int no)
	{
		this.no = no;
	}
	public void run()
	{
		System.out.println("Start of thread :- " + Thread.currentThread().getName());
		for(int i=0;i<no;i++)
		{
			try
			{
				Thread.sleep(300);
				System.out.println(Thread.currentThread().getName() + " number :-" + i);	
			}
			catch (Exception e)
			{
				System.out.print("complted erro");		
			}
		}
		System.out.println("end of thread :- " + Thread.currentThread().getName());
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
		System.out.println("Start of thread :- " + Thread.currentThread().getName());
		for(int i=0;i<no;i++)
		{
			try
			{
				Thread.sleep(300);
				System.out.println(Thread.currentThread().getName() + " number :-" + i);	
			}
			catch (Exception e)
			{
				System.out.print("complted erro");		
			}
		}
		System.out.println("end of thread :- " + Thread.currentThread().getName());
	}
}
public class control_thread 
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("enter number :- ");
		int no = sc.nextInt();
		a obja = new a(no);
        obja.setName("yash");
		obja.start();
        try
        {
            obja.join();
        }
        catch(Exception e)
        {
            System.out.println("error in join");
        }
        
        b objb = new b(no);
        objb.setName("neel");
		objb.start();
    }        
}
