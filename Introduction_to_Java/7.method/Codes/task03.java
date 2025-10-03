import java.util.Scanner;
public class task03 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        boolean check = isPrime(num);
        System.out.print(check);
        sc.close();

    }   
    
    public static boolean isPrime(int n)
    {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
