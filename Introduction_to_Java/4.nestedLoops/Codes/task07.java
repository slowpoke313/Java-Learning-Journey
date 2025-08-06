import java.util.Scanner;
public class task07
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating a isosceles triangle with n digits:");
        
        System.out.print("Enter height of the triangle: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int k=(n-i)*2; k>0; k--)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=(i*2)-1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}