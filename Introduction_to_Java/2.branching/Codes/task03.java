
import java.util.Scanner;
public class task03 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator: ");
        String operator = sc.next();
        double result;
        if(operator.equals("+"))
        {
            result = num1 + num2;
            System.out.print("1st number + 2nd Number = " + result);
        }
        else if(operator.equals("-"))
        {
            result = num1 - num2;
            System.out.print("1st number - 2nd Number = " + result);
        }
        else if(operator.equals("*"))
        {
            result = num1 * num2;
            System.out.print("1st number * 2nd Number = " + result);
        }
        else if(operator.equals("/"))
        {
            result = num1 / num2;
            System.out.print("1st number / 2nd Number = " + result);
        }
        sc.close();

    }     
}
