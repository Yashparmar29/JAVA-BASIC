import java.util.Scanner;

public class switch_cals
{
     public static void main(String[] args)
     {
        Scanner no1 = new Scanner(System.in);
        int a = no1.nextInt();
        Scanner no2 = new Scanner(System.in);
        int b = no2.nextInt();

        System.out.println("option :- ");
        System.out.println("1.--addtion--");
        System.out.println("2.deletion");
        System.out.println("3.multiplication");
        System.out.println("4.division");

        Scanner ch = new Scanner(System.in);
        int choice = ch.nextInt();

        switch (choice) {
            case 1:
                int sum = a + b ;
                System.out.println("a + b :- " + sum);
                break;
            case 2:
                int del = a - b ;
                System.out.println("a - b :- " + del);
                break;
            case 3:
                int mul = a * b ;
                System.out.println("a * b :- " + mul);
                break;
            case 4:
                int div = a / b ;
                System.out.println("a / b :- " + div);
                break;
            default:
            System.out.println("choose correct number");
                break;
        }
     }    
}
