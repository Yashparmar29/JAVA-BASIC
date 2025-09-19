import java.util.*;
class UserExcep extends Exception

{
    int age;
	
	UserExcep(String s)
	{
		super(s);
		
	
	}
	/*UserExcep(String s)
	{
	super(s);
	}*/

	void test(int a) //throws UserExcep
	{
	age=a;
	
	try
	{
		
	if(age>40)
		throw new UserExcep("Invalid Age");
	System.out.println("Age="+age);
	}
	catch (UserExcep e)
	{
	System.out.println(e.getMessage());
	
	//throw e;
	}

	}

	
	public static void main(String[] args)//throws UserExcep
	{
	
	UserExcep p=new UserExcep("");
	p.test(50);
	
	}
}

