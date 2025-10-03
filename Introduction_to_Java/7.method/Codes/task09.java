import java.util.Scanner;
//import java.lang.NumberFormatException;
public class task09 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String str = sc.next();
        int decimal = isDecimal(str);
        if(decimal==-1)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            System.out.println(decimal);
        }

        System.out.print(toHex(decimal));
        sc.close();

    }
    
    public static int isDecimal(String str)
    {
        int sum=0;
        long num = checkIfNum(str);
        if(num == -1)
        {
            return -1;
        }
        else
        {
            for(int i=0; num>0; i++)
            {
                long digit = num%10;
                sum += digit * Math.pow(2,i);
                num = num/10;
            }
            return sum;
        }
    }

    public static long checkIfNum(String str)
    {
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '0' || str.charAt(i) == '1')
            {
                count++;
            }

        }

        if(count == str.length())
        {
            try
            {
                long num = Long.parseLong(str); //converting string to int to calculate
                return num;             
            }
            catch(NumberFormatException e)
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }

    public static String toHex(int num)
    {
        String hex = "";
        while(num>0)
        {
            int digit = num%16;
            if(digit==10)
            {
                hex = hex + "A";
            }
            else if(digit==11)
            {
                hex = hex + "B";
            }
            else if(digit==12)
            {
                hex = hex + "C";
            }
            else if(digit==13)
            {
                hex = hex + "D";
            }
            else if(digit==14)
            {
                hex = hex + "E";
            }
            else if(digit==15)
            {
                hex = hex + "F";
            }
            else
            {
                hex = hex + digit;
            }
            num = num/16;
        }
        String finalVal = reverseString(hex);
        return finalVal;
    }

    public static String reverseString(String str)
    {
        String reverseNum = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            reverseNum = reverseNum + str.charAt(i);
        }
        return reverseNum;
    }
}



    // public static int digitCount(int num)
    // {
    //     int count = 0;
    //     while(num>0)
    //     {
    //         num = num/10;
    //         count++;
    //     }
    //     return count;
    // }
