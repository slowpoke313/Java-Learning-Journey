import java.util.Scanner;
import java.lang.Math;
public class task10 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        long num = sc.nextLong();

        int digitCount = 0;
        long temp = num;
        while(temp>0)
        {
            digitCount++;
            temp = temp/10;
        }
        
        long divisor = (long) Math.pow(10,digitCount-1);
        long digit;

        while(digitCount>0)
        {
            digit = num / divisor;
            System.out.print(digit);

            if(digitCount!=1)
            {
                System.out.print(", ");
            }
            num = num % divisor;
            divisor = divisor/10; 
            digitCount--;   
        }
        sc.close();

    }    
}
