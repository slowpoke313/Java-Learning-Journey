import java.util.Scanner;
public class task10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter 3rd number: ");
        float num3 = sc.nextFloat();
        float max;
        float maxResult;
        float min;
        float minResult;
        max = num1>num2 ? num1 : num2;
        maxResult = max>num3 ? max : num3;

        min = num1<num2 ? num1 : num2;
        minResult = min<num3 ? min : num3;
        System.out.println("The Maximum number is " + maxResult);
        System.out.print("The Minimum number is " + minResult);
        sc.close();
    }
}