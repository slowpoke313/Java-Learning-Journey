import java.util.Scanner;
public class task01
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
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.print("The 1st number " + num1 + " is the largest!");
            }
        }
        else if(num2>num3)
        {
            System.out.print("The 2nd number " + num2 + " is the largest!");
        }
        else
        {
            System.out.print("The 3rd number " + num3 + " is the largest!");
        }

        sc.close();

    }
}