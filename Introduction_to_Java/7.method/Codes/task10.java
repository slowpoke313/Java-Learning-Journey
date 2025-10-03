import java.util.Scanner;
public class task10 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers(Comma space ', ' seperated): ");
        String input = sc.nextLine();

        String[] inputArray = input.split(", ");

        int[] array = new int[inputArray.length];

        for(int i=0; i<array.length; i++)
        {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.println("Prime Numbers:");
        for(int i=0; i<array.length; i++)
        {
            if(primeCheck(array[i]))
            {
                System.out.println(i + " : " + array[i]);
            }
        }

        System.out.println("Perfect Numbers:");
        for(int i=0; i<array.length; i++)
        {
            if(perfectCheck(array[i]))
            {
                System.out.println(i + " : " + array[i]);
            }
        }

        sc.close();
    }   
    
    public static boolean primeCheck(int num)
    {
        if(num<2)
        {
            return false; 
        }

        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean perfectCheck(int num)
    {
        int total = 0;
        for(int i=1; i<=num/2; i++)
        {
            if(num%i==0)
            {
                total = total + i;
            }
        }

        if(total==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
