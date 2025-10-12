import java.util.Scanner;

interface calculateresult 
{
    abstract void total();
    abstract void percantege();
    abstract void grade();
}
class student implements calculateresult
{
    Scanner sc = new Scanner(System.in);
    int id,subno;
    String name;
    int sub[];
    student()
    {
        System.out.print("enter student id :- ");
        id = sc.nextInt();
        System.out.print("enter name :- ");
        name = sc.next();
        System.out.print("enter sub no :- ");
        subno = sc.nextInt();
        sub = new int[subno];
        System.out.println("student id :- " + id);
        System.out.println("student name :- " + name);
         for(int i=0;i<subno;i++)
        {
            System.out.print("enter sub marks :- ");
            sub[i] = sc.nextInt();
        }
        for(int i=0;i<subno;i++)
        {
            System.out.println("sub :- " + sub[i]);
        }
    }
    int total = 0;
    public void total()
    {
        for(int i=0;i<subno;i++)
        {
            total += sub[i];
        }
        System.out.println("total marks :- " + total);
    }
    float per;
    public void percantege()
    {
        per = total / subno;
        System.out.println("grade :- " + per);
    }
    public void grade()
    {
        if(per < 100 && per > 90)
        {
            System.out.println("Grade A+");
        }
        else if(per < 90 && per > 80)
        {
            System.out.println("Grade A");
        }
        else if(per < 80 && per > 70)
        {
            System.out.println("Grade B+");
        }
        else if(per < 70 && per > 60)
        {
            System.out.println("Grade B");
        }
        else if(per < 60 && per > 50)
        {
            System.out.println("Grade C");
        }
        else if(per < 50 && per > 40)
        {
            System.out.println("Grade D");
        }
        else if(per < 40 && per > 33)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Fail !!!!!!!!!");
        }
    }
}
public class result_interface 
{
    public static void main(String[] args)
    {
        student s = new student();
        s.total();
        s.percantege();
        s.grade();
    }    
}
