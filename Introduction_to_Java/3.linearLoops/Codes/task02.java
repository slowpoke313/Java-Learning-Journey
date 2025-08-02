import java.util.Scanner;
public class task02 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of inputs you want: ");
        int inputNumber = sc.nextInt();

        int res = 0;
        
        for(int i=0; i<inputNumber; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            res = res + sc.nextInt();
        }

        float avg = (float) res/inputNumber;

        System.out.println("The sum of the " + inputNumber + " given numbers are: " + res);
        System.out.print("The average of the " + inputNumber + " given numbers is: " + avg);
        sc.close();
    }    
}
