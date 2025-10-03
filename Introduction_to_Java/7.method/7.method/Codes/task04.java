import java.util.Scanner;
public class task04 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean check = isPerfect(num); 
        System.out.println(check);

        sc.close();
    }    

    public static boolean isPerfect(int num)
    {
        int total = 0;
        for(int i=1; i<=(num/2); i++)
        {
            if(num%i==0)
            {
                total = total + i;
            }
        }
        
        return total==num;
    }
}
