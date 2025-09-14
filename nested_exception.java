import java.util.*;
public class nested_exception 
{
    int java,python,rm,peace,adbms,yoga;
    public void marks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks of java :- ");
        java = sc.nextInt();
        System.out.print("enter marks of python :- ");
        python = sc.nextInt();
        System.out.print("enter marks of rm :- ");
        rm = sc.nextInt();
        System.out.print("enter marks of peace :- ");
        peace = sc.nextInt();
        System.out.print("enter marks of adbms :- ");
        adbms = sc.nextInt();
        System.out.print("enter marks of yoga :- ");
        yoga = sc.nextInt();
    }
    void total()
    {
        if(java > 33 && python > 33 && rm > 33 && peace > 33 && adbms > 33 && yoga > 33)
        {
            System.out.println("you can every subject your result is created");
            System.out.println();
            System.out.println("java :- " + java);
            System.out.println("python :- " + python);
            System.out.println("RM :- " + rm);
            System.out.println("peace :- " + peace);
            System.out.println("adbms :- " + adbms);
            System.out.println("yoga :- " + yoga);
            int total = java + python + rm + peace + adbms + yoga;
            System.out.println();
            System.out.println("your percentege :-" + (total/6));
        }
        else
        {
            int total = java + python + rm + peace + adbms + yoga;
            System.out.println();
            System.out.println("your percentege :-" + (total/6));
            System.err.println("you are fell in the exam");
        }
    }
    public static void main(String[] args)
    {
        nested_exception n = new nested_exception();
        Scanner sc = new Scanner(System.in);
        try
        {
            n.marks();
        }
        catch(Exception e)
        {
            System.out.println("enter valid marks :- ");
            System.out.print("would you like continue yas or not :- ");
            String ch = sc.next();
            if(ch.equals("yes"))
            {
                n.marks();
            }
            else
            {
                System.exit(1);
            }
        }
        try
        {
            n.total();
        }
        catch(ArithmeticException e)
        {
            System.out.println("your one or more subject marks is 0 then you are fell in the exam....");
        }

    }
    
}

/*
 * output :- 
 * 
PS D:\JAVA DSA\exception handling> javac nested_exception.java
enter marks of java :- 45
enter marks of python :- 89
enter marks of rm :- 78
enter marks of peace :- 26
enter marks of adbms :- 0
enter marks of yoga :- 14

your percentege :-42
you are fell in the exam
 */