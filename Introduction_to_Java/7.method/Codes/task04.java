import java.util.Scanner;
public class task04 
{
    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean check = isPerfect(num);
        System.out.print(check);
        sc.close();
    }   
    
    public static boolean isPerfect(int n)
    {
        int divisorSum = 0; 
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                divisorSum = divisorSum + i;
            }
        }
        if(divisorSum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
