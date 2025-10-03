import java.util.Scanner;
import java.lang.Math;
public class task08alternate 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean type = isHappyNumber(num);
        System.out.print(type);
        sc.close();
    }   
    
    public static boolean isHappyNumber(int num)
    {
        int fastrun = num;
        int slowrun = num;
        do
        {
            slowrun = sumOfSquare(slowrun);
            fastrun = sumOfSquare(sumOfSquare(fastrun));
        }
        while(slowrun != fastrun);

        if(slowrun == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int sumOfSquare(int num)
    {
        int sum = 0;
        while(num>0)
        {
            int digit = num%10;
            sum += Math.pow(digit,2);
            num = num/10;
        }
        return sum;
    }
}

//explanation:
//https://leetcode.com/problems/happy-number/solutions/56919/Explanation-of-why-those-posted-algorithms-are-mathematically-valid/