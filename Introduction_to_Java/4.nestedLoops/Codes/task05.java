import java.util.Scanner;
public class task05 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Create a rectangle with 1234...");
        
        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        System.out.print("Enter the width: ");
        int width = sc.nextInt();

        for(int i=0; i<width; i++)
        {
            for(int j=1; j<=length; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}