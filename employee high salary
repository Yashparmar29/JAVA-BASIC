import java.util.*;
class staff
{
    Scanner sc = new Scanner(System.in);
    String name,designation;
    int birth_date;
    double salary;

    //get user value
    staff()
    {
        System.out.print("enter name :- ");
        name = sc.next();
        System.out.print("enter date of birth");
        birth_date = sc.nextInt();
        System.out.print("designation :-");
        designation = sc.next();
        System.out.print("enter salary :- ");
        salary = sc.nextInt();
        System.out.println();
    }
}
public class high_sal 
{
    public static void main(String[] args)
    {
        staff f[] = new staff[5];
        for(int i=0;i<5;i++)
        {
            f[i] = new staff();
        }
        int j=0;
        for(int i=0;i<=4;i++)
        {
            if(i == 4)
            {
                if(f[i].salary < f[i].salary)
                {
                    j=i;
                }
            }
            else
            {
                if(f[i].salary < f[i+1].salary)
                {
                    j=i;
                }
            }
        }
        System.out.println("name :- " + f[j].name);
        System.out.println("date of birth :- " + f[j].birth_date);
        System.out.println("designation :- " + f[j].designation);
        System.out.println("salary :- " + f[j].salary);
    }

}
