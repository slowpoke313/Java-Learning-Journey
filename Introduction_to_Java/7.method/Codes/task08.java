import java.util.Scanner;
import java.lang.Math;
import java.util.HashSet;
public class task08 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        HashSet<Integer> usedNum = new HashSet<Integer>(); //works like list in python
        while(true)
        {
            if(squaredSum(num) == 1)
            {
                System.out.print("Happy Number");
                break;
            }

            num = squaredSum(num);
            
            if(usedNum.contains(num))
            {
                System.out.print("It's not a Happy Number");
                break;
            }

            usedNum.add(num);

        }
        sc.close();
        
    }   
    
    public static int squaredSum(int num)
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
