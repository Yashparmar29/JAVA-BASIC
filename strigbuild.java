public class strigbuild 
{
    public static void main(String[] args)
    {
        StringBuilder name = new StringBuilder("yash parmar");
        System.out.println(name);

        // character print with seprates......

        System.out.println(name.charAt(0));

        // replace character with another character

        name.setCharAt(0, 'p');
        System.out.println(name);

        //add index with another character 

        name.insert(0,'y');
        System.out.println(name);

        // add character with 2nd and 3th character

        name.insert(1,'p');
        System.out.println(name);

        // delete character in any stringbuilder

        name.delete(0,3);
        System.out.println(name);

        //use append function 

        StringBuilder name1 = new StringBuilder("bhavik");
        name1.append(" ");
        name1.append("parmar");
        System.out.println(name1);

        //print length it can be same as string

        System.out.println(name.length());
        System.out.println(name1.length());
    }    
}
