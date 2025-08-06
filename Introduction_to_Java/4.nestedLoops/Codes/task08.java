import java.util.Scanner;
import java.lang.Math;
public class task08
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Start from: ");
        int startNum = sc.nextInt();

        System.out.print("End at: ");
        int endNum = sc.nextInt();

        int digitCounter;
        int res;
        int sumOfDigits;
        int digit;
        int armstrongNumCount=0;

        for(int i=startNum; i<=endNum; i++)
        {
            res = i;
            digitCounter = 0;
            sumOfDigits = 0;
            while(res>0)
            {
                digitCounter++;
                res = res/10;
            }
            
            res = i;
            while(res>0) 
            {
                digit = res%10;
                sumOfDigits = sumOfDigits + (int) Math.pow(digit, digitCounter);
                res = res/10;
            }

            if(sumOfDigits==i)
            {
                System.out.println("=> " + i);
                armstrongNumCount++;
            }

        }

        if(armstrongNumCount>0)
        {
            System.out.println("Total " + armstrongNumCount + " Armstrong numbers found.");
        }
        else
        {
            System.out.println("No Armstrong number in this range.");
        }
        sc.close();
    }
}