import java.util.Scanner;
public class task09 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the the binary number: ");
        String bin = sc.nextLine();

        int decimal = toDecimal(bin);
        System.out.println(decimal);

        String hex = toHex(decimal);
        System.out.println(hex);

        sc.close();
    }    

    public static int toDecimal(String num)
    {
        int digit;
        int decimal = 0;
        for(int i=0; i<num.length(); i++)
        {
            digit = num.charAt(num.length()-1-i) - '0';
            decimal = decimal + ((int) Math.pow(2,i) * digit);
        }
        return decimal;
    }

    public static String toHex(int num)
    {
        if(num==0)
        {
            return "0";
        }

        char[] hexCharacters = {'0', '1', '2', '3', '4', '5', '6', '7','8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hex = "";
        int hexDigit;
        while(num>0)
        {
            hexDigit = num%16;
            num = num/16;

            hex = hexCharacters[hexDigit] + hex;
        }

        return hex;
    }
}
