
class Calci
{
	void operation()
	{
		int num1=20,num2=0;
                try
                {
				division(num1,num2);	
                }
                catch(ArithmeticException e)
			   {
				System.out.println("Inside operation()  :"+e);
			     num2=4;
				 division(num1,num2);
				 
			    }
				
	
	}	
	
	void division(int x,int y)
	{
		
			try
			{
			int div=x/y;
			System.out.println("Division :"+div);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Inside division() Divide by Exception :"+e);
			 throw e;
			}
			
	
	}
}


class ThrowDemo
{
	public static void main(String[] args) 
	{
	
	  Calci c=new Calci();
	     try
	     {
			c.operation();
	     }
	     catch(ArithmeticException e)
			{
				System.out.println("Inside main() Divide by Exception :"+e);
			 throw e;
			}
		 

	}
}
