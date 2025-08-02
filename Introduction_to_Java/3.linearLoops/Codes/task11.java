import java.util.Scanner;
public class task11 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int perfectCount = 0;
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
            {
                count++;
                perfectCount = perfectCount + i;
            }
        }

        if(count==1)
        {
            System.out.println(num + " is a Prime Number.");
        }
        else
        {
            System.out.println(num + " is Not a Prime Number");
        }

        if(perfectCount==num)
        {
            System.out.println(num + " is a Perfect Number");
        }
        else
        {
            System.out.println(num + " is Not a Perfect Number");
        }
        
        sc.close();
    }    
}
//No number can be both prime and perfect!