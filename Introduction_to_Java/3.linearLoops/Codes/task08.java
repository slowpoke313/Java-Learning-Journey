import java.util.Scanner;
public class task08 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till you want to see integers that are divisible by 5 but not 3: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++)
        {
            if(i%5==0 && i%3!=0)
            {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
