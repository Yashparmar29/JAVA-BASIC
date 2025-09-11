import java.util.Scanner;

public class print_name {
    public static void myname(String name) { // Corrected: return type to void and String capitalized
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected: Scanner capitalized
        String name = sc.next();
        myname(name);
        sc.close(); // Important: Close the scanner to release resources
    }
}