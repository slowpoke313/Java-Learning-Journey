import java.util.Scanner;
public class task06
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want: ");
        int num = sc.nextInt();

        int sum = 0;
        int odd = 1;

        for(int i=0; i<num; i++)
        {
            System.out.println(odd);
            sum = sum + odd;
            odd = odd + 2;
        }

        System.out.println("The Sum of odd Natural Numbers up to " + num + " term is: " + sum);

        //We could also use the formula for finding the sum of first n natural numbers to check our result.
        // Sum of first n odd numbers = n^2
        int check = num*num;
        System.out.println("Formula check: " + num + "^2 = " + check);

        sc.close();
    }    
}
