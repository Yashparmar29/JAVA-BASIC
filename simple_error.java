import java.util.*;
class simple_error
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("enter  no :- ");
            int rollno = sc.nextInt();
            System.out.print("enter  no1 :- ");
            int rollno1 = sc.nextInt();
            int total = rollno/rollno1;
            System.out.println("total is :-" + total);
            System.out.print("enter name :- ");
            String name = sc.next();
        }
       
       catch(ArithmeticException e)
        {
            System.out.println("this arithmatic class");
        } 
       catch(Exception e)
        {
            System.out.println("this is exception class");
        }
    }
}

/*
output :- 

    PS D:\JAVA DSA\exception handling> javac simple_error.java
    PS D:\JAVA DSA\exception handling> java simple_error      
    enter  no :- 10
    enter  no1 :- 0
    this arithmatic class
 */