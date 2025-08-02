import java.util.Scanner;
import java.lang.Math;
public class task07 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Piecewise function is: f(x)=2x, x<0");
        System.out.println("f(x) = 2x, x<0");
        System.out.println("     = x + 1, 0<=x<2");
        System.out.println("     = x^2 - 1, 2<=x<5");
        System.out.println("     = 3x^2 + 2, 5<=x");
        System.out.print("Enter the value of x: ");
        double x = sc.nextInt();
        if(x<0)
        {
            System.out.print("Output: " + 2*x);
        }
        else if(x>=0 && x<2)
        {
            x = x+1;
            System.out.print("Output: " + x);
        }
        else if(x>=2 && x<5)
        {
            x = Math.pow(x,2) - 1;
            System.out.print("Output: " + x);
        }
        else
        {
            x = Math.pow(3*x,2) + 2;
            System.out.print("Output: " + x);
        }
        sc.close();

    }
}
