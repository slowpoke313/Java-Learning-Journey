import java.lang.Math;
public class task14 
{
    public static void main(String args[])
    {
        float side = (float) Math.sqrt(Math.pow(3,2) + Math.pow(4,2));
        System.out.println("formula of the area of a hexagon is (3*3^1/2 * side^2)/2");
        float area = (float) (3*Math.sqrt(3)*Math.pow(side,2)/2);
        System.out.println("Area of the given hexagon is: " + area);
        System.out.println("Circumference of the given hexagon is: " + side*6);
        
    }    
}
