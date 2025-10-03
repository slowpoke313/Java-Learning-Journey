import java.util.Scanner;
public class task08 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        // Using Loops:
        boolean check = isHappyNumber(num);
        System.out.println("The number " + num + " is a happy number: " + check);

        // Using Recursion:
        String numberStack = " ";
        boolean recursionCheck = isHappyNumber2(num, numberStack);
        System.out.println("The number " + num + " is a happy number: " + recursionCheck);

        sc.close();
    }
    
    // Using loops:
    public static boolean isHappyNumber(String num)
    {
        int total;
        int digit;

        String newNum;
        String numberStack = " ";
        
        while(true)
        {
            total = 0;
            for(int i=0; i<num.length(); i++)
            {
                digit = num.charAt(i) - '0';
                total = total + (int) Math.pow(digit, 2);
            }

            newNum = Integer.toString(total);

            if(newNum.equals("1"))
            {
                return true;
            }
            
            if(numberStack.contains(" " + newNum + " "))
            {
                return false;
            }

            numberStack = numberStack + newNum + " ";
            num = newNum;
        }
        
    }

    // Using Recursion:
    public static boolean isHappyNumber2(String num, String numberStack)
    {
        int total = 0;
        int digit;
        for(int i=0; i<num.length(); i++)
        {
            digit = num.charAt(i) - '0';
            total = total + (int) Math.pow(digit, 2);
        }
        
        String newNum = Integer.toString(total);
        
        if(newNum.equals("1"))
        {
            return true;
        }
        
        if(numberStack.contains(" " + newNum + " "))
        {
            return false;
        }
        
        numberStack = numberStack + newNum + " ";
        return isHappyNumber2(newNum, numberStack);
    }
}
