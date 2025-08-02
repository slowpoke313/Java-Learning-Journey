import java.util.Scanner;
public class task03 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num;
        int res;

        while(true)
        {
            System.out.print("Enter Number(enter negetive number to terminate program): ");
            num = sc.nextInt();

            if(num>0)
            {
                res = num*num;
                System.out.println(num + "^2 = " + res);
            }
            else
            {
                System.out.print("Program terminated.");
                break;
            }
        }
        sc.close();
    }    
}
