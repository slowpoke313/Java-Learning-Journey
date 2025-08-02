//Task01 with ternary operator:
import java.util.Scanner;
public class ternaryOperator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();
        int temp;
        int result;
        
        temp = num1>num2 ? num1 : num2;
        result = temp>num3 ? temp : num3;

        System.out.print("The largest Number is: " + result);
        sc.close();
    }
}