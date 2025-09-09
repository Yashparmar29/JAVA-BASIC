import java.util.Scanner;
public class element_count 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :- ");
        String name = sc.nextLine();

        int chaa = 0;
        int space = 0;
        int special_char = 0;
        for(int i=0;i<name.length();i++)
        {
            char c = name.charAt(i);//that function use to give specific character in string..
            if(Character.isLetter(c))//that function use on compare to A-Z or a-z
            {
                chaa++;
            }
            else if(Character.isWhitespace(c))//that function count on space in character..
            {
                space++;
            }
            else
            {
                special_char++;
            }
        }

        System.out.println("character :- " + chaa);
        System.out.println("spaces :- " + space);
        System.out.println("special character :- " + special_char);
    }   
}
