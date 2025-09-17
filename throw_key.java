class throw_k
{
    void show()
    {
        try
        {
            err();
        }
        catch(ArithmeticException e)
        {
            System.out.println("show method :- you have entered zero");
            throw e;
        }
    }
    void err()
    {
        try
        {
            int n = 10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("err method :- you have enterd zero");
            throw e;
        }
    }
}
class throw_key
{
    public static void main(String[] args)
    {
        throw_k o = new throw_k();
        try
        {
            o.show();
        }
        catch(Exception e)
        {
            System.out.println("this is main method error");
        }
    }
}