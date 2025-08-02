import java.util.Scanner;
public class task09 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        int digit = 0;
        
        while(true)
        {
            if(num>0)
            {
                digit++;
                num = num/10;
            }
            else
            {
                break;
            }
        }

        System.out.print("Total digits = " + digit);
        sc.close();
    }
}
