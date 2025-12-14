import java.util.*;
import javax.lang.model.util.ElementScanner14;
class student
{
    int marks;
    student(Scanner sc)
    {
        System.out.print("Enter Marks :- ");
        marks = sc.nextInt();

        if(marks >= 90)
        {
            System.out.println("A+");
        }
        else if(marks > 80 && marks < 90)
        {
            System.out.println("A");
        }
        else if(marks > 70 && marks < 80)
        {
            System.out.println("B+");
        }
        else if(marks > 60 && marks < 70)
        {
            System.out.println("B+");
        }
        else if(marks > 50 && marks < 60)
        {
            System.out.println("C");
        }
        else if(marks > 40 && marks < 50)
        {
            System.out.println("D");
        }
        else if(marks > 33 && marks < 40)
        {
            System.out.println("E");
        }
        else
        {
            System.out.println("Fail.....");
        }
    }
}
public class example
{
    void show(Scanner sc)
    {
        System.out.print("Enter 0 / 1 :- ");
        int n = sc.nextInt();

     //   int no = 1;
        
        while(true)
        { 
            if(n == 1)
            {
                student s = new student(sc);
                show(sc);
            }    
            else
            {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        example e = new example();
        e.show(sc);
    }

}
