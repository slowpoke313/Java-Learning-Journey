import java.lang.Math;
import java.util.Scanner;
public class task02 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int rad = sc.nextInt();
        // double area = circleArea(rad);
        // System.out.println("The area of the circle is: " + String.format("%.4f",area));

        // double volume = sphereVolume(rad);
        // System.out.println("The volume of the sphere is: " + String.format("%.4f", volume));

        System.out.print("Which shape is the radius of?: ");
        String shape = sc.next();
        findSpace(rad,shape);
        sc.close();
    }
    
    public static double circleArea(int n)
    {
        double rad = n;
        double area = Math.PI * Math.pow(rad,2);
        return area;
    }

    public static double sphereVolume(int n)
    {
        double rad = n;
        double volume = (4.0/3.0) * Math.PI * Math.pow(rad,3);
        return volume;
    }

    public static void findSpace(int n, String shape)
    {
        String s1 = "circle";
        String s2 = "sphere";
        if(shape.equalsIgnoreCase(s1))
        {
            double area = circleArea(n);
            System.out.println("The area of the circle is: " + String.format("%.4f",area));
        }
        else if(shape.equalsIgnoreCase(s2))
        {
            double volume = sphereVolume(n);
            System.out.println("The volume of the sphere is: " + String.format("%.4f",volume));
        }
        else
        {
            System.out.print("Wrong Parameter.");
        }
    }
    
}
