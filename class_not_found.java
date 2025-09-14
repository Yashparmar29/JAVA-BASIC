class yash
{

}
class bhavik extends yash
{

}

public class class_not_found 
{
    public static void main(String[] args)
    {
        try
        {
            bhavik c = new bhavik();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("you have not define class so please define class.");
        }
    }
}
