import java.util.Scanner;
public class task02 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is the series: \ny = -(1)-(1+2)-(1+2+3)- . . . .- (1+2+3+ . . . +N)");
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int grandTotal = 0;
        int total;
        for(int i=1; i<=n; i++)
        {
            total = 0;
            for(int j=1; j<=i; j++)
            {
                total = total + j;
            }

            grandTotal = grandTotal - total;
        }

        System.out.print(grandTotal);
        sc.close();
    }    
}
