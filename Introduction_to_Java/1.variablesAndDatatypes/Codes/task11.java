import java.lang.Math;
import java.util.Scanner;
public class task11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Altitude: ");
        float a = sc.nextFloat();
        System.out.println("Enter Base: ");
        float b = sc.nextFloat();
        System.out.println("Enter Hypotenuse: ");
        float c = sc.nextFloat();
        float sinA = 0;
        float cosA = 0;
        float sinB = 0;
        float cosB = 0;

        if(Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2))
        {
            System.out.println("Here, the opposite side of Hypotenuse is angel C, the opposite side of Altitude is angel A and the opposite side of Base is angel B.");
            sinA = a/c;
            sinB = b/c;
            cosA = b/c;
            cosB = a/c;
            System.out.println("sinA= "+sinA);
            System.out.println("cosA= "+cosA);
            System.out.println("sinB= "+sinB);
            System.out.println("cosB= "+cosB);
        }
        else
        {
            System.out.print("The triangle is not a right angel triangle!!!");
        }
        sc.close();

    }
}