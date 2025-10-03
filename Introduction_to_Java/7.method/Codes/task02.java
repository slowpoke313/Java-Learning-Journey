import java.util.Scanner;
public class task02 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // A:
        System.out.print("Enter the radius of the circle: ");
        int radiusA = sc.nextInt();

        double areaA = circleArea(radiusA);
        System.out.println(String.format("%.4f", areaA));

        // B:
        System.out.print("Enter the radius of the sphere: ");
        int radiusB = sc.nextInt();

        double areaB = sphereVolume(radiusB);
        System.out.println(String.format("%.4f", areaB));

        sc.nextLine();
        // C:
        System.out.print("Enter the shape name: ");
        String shapeName = sc.nextLine();
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();

        findSpace(radius, shapeName);

        sc.close();
    }

    // A:
    public static double circleArea(int rad)
    {
        return (Math.PI * rad * rad);
    }

    // B:
    public static double sphereVolume(int rad)
    {
        return ((4.0/3.0) * Math.PI * Math.pow(rad, 3));
    }

    // C:
    public static void findSpace(int rad, String shape)
    {
        if(shape.equalsIgnoreCase("circle"))
        {
            System.out.println(String.format("%.4f", circleArea(rad)));
        }
        else if(shape.equalsIgnoreCase("sphere"))
        {
            System.out.println(String.format("%.4f", sphereVolume(rad)));
        }
        else
        {
            System.out.println("Wrong parameter given!!!");
        }
    }
}
