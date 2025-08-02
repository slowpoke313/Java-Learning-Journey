import java.util.Scanner;
public class task13
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
        if(num1==num2 && num2==num3)
        {
            System.out.print("All numbers are equal.");
        }
        else if(num1==num2 || num1==num3 || num2==num3)
        {
            System.out.print("Neither all are equal nor different");
        }
        else
        {
            System.out.print("All numbers are different");
        }
        sc.close();
    }
}