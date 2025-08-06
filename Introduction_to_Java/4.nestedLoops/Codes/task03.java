import java.util.Scanner;
public class task03 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num;
        int divisorCount;
        while(true)
        {
            System.out.print("Enter an even number(enter odd number to terminate the program): ");
            num = sc.nextInt();
            divisorCount = 0;
            if(num%2==0)
            {
                for(int i=1; i<=num; i++)
                {
                    if(num%i==0)
                    {
                        divisorCount++;
                    }
                }

                System.out.println(num + " has " + divisorCount + " divisors");
            }
            else
            {
                break;
            }
        }

        sc.close();
    }
}
