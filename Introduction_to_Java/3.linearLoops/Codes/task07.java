import java.util.Scanner;
public class task07 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many inputs do you want: ");
        int inputNum = sc.nextInt();

        int sum = 0;
        for(int i=0; i<inputNum; i++)
        {
            System.out.print("Enter number: ");
            int input = sc.nextInt();
            sum = sum+input;
            System.out.println("Sum = "+sum);
        }
        
        sc.close();
    }
}