import java.util.Scanner;
public class task10 
{
    public static void main(String[] args)
    {
        //formula for the sum = n/2 {2a + (n-1)d}
        // n = number of term
        // a = start number
        // d = difference of the terms
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Enter the first term: ");
        int a = sc.nextInt();

        System.out.println("Enter the difference between terms: ");
        int d = sc.nextInt();


        int output = n/2 * (2*a + (n-1)*d);
        System.out.println("Sum of the series is: " + output);
        sc.close();


    }
    
}
