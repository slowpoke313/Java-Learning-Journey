import java.util.Scanner;
public class task01 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many prime numbers you want to see: ");
        int range = sc.nextInt();

        int num = 2;
        int count;

        for(int i=0; i<range; )
        {
            count = 0;
            for(int j=1; j<num; j++)
            {
                if(num%j==0)
                {
                    count++;
                }
            }

            if(count==1)
            {
                System.out.println(num);
                i++;
            }

            num++;
        }
        sc.close();
    }    
}
