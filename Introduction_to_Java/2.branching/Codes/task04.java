import java.util.Scanner;
public class task04 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num%5==0 && num%7==0)
        {
            System.out.println("The number "+ num + " is divisable by both 5 and 7");
        }
        else if(num%5==0)
        {
            System.out.println("Invalid. The number "+ num + " is divisable by only 5");
        }
        else if(num%7==0)
        {
            System.out.println("Invalid. The number "+ num + " is divisable by only 7");
        }
        else
        {
            System.out.println("Invalid Input. The number "+ num + " is not divisable by 5 or 7.");
        }
        sc.close();
    }    
}
