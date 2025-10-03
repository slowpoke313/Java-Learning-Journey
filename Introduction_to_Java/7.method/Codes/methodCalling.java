class dummy
{
    public void greet()
    {
        System.out.println("Hello world!");
    }
}

public class methodCalling 
{
    public static void main(String args[])
    {
        dummy obj = new dummy();
        obj.greet();
    }    
}
