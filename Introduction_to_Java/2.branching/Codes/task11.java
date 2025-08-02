import java.util.Scanner;
public class task11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side of the triangle: ");
        float side1 = sc.nextFloat();
        System.out.print("Enter 2nd side of the triangle: ");
        float side2 = sc.nextFloat();
        System.out.print("Enter 3rd side of the triangle: ");
        float side3 = sc.nextFloat();
       
        if(side1==side2 && side1==side3)
        {
            System.out.print("This is a Equilateral triangle.");
        }
        else if(side1==side2 || side1==side3 || side2==side3)
        {
            System.out.print("This is a Isosceles triangle.");
        }
        else
        {
            System.out.print("This is a Scalene triangle.");
        }
        
        sc.close();
    }
}