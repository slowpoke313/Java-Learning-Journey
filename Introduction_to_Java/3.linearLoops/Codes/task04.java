import java.util.Scanner;
public class task04 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of which you want to see the divisors of: ");
        int num = sc.nextInt();

        System.out.println("The divisors of " + num + " are:");
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }    
}
