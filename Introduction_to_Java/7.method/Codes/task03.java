import java.util.Scanner;
class task03
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean check = isPrime(num); 
        System.out.println("Is the number a Prime Number: " + check);

        sc.close();
    }

    public static boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                return false; // this return automatically breaks the loop and completes the method.
            }
        }            
        return true;            
    }
}