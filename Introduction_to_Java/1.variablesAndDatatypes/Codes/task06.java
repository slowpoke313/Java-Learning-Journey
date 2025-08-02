public class task06 
{
    public static void main(String[] args)
    {
        //Part 01:
        int a = 60;
        int b = 25;
        System.out.println("A is " + a);
        System.out.println("B is " + b);

    
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A is " + a);
        System.out.println("B is " + b);

        
        //Part 02:
        int x = 69;
        int y = 96;
        System.out.println("A is " + x);
        System.out.println("B is " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("A is " + x);
        System.out.println("B is " + y); 

        //part 03:
        int p = 313;
        int q = 213;
        System.out.println("A is " + p);
        System.out.println("B is " + q);

        p = p * q;
        q = p/q;
        p = p/q;
        System.out.println("A is " + p);
        System.out.println("B is " + q);


    }

    
}
