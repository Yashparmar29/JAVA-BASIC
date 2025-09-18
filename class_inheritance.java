class user
{
	int uid;
	varchar uname;
	user()
	{
		System.out.print("enter user id :- ");
		uid = sc.nextInt();
		System.out.print("enter user name :- ");
		uname = sc.next();
	}
	void show()
	{
		System.out.print("----user details ----");
		System.out.print("user id :- " + uid);
		System.out.print("user name :- " + uname);
	}
	
}
class book extends user
{
	user u = new user();
	varchar book[] = new varchar[10];
	int qty[] = new int[10];
	
}
public class class_inheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("")
    }
}
