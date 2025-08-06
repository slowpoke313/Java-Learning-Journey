import java.util.Scanner;
public class task06
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating a right triangle with n digits:");
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int k=(n-i)*2; k>0; k--)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}