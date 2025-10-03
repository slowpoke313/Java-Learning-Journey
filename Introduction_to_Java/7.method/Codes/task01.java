import java.util.Scanner;
public class task01 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        // A:
        System.out.print("Enter a number for task01-A: ");
        int numA = sc.nextInt();

        evenChecker(numA);

        // B:
        System.out.print("Enter a number for task01-B: ");
        int numB = sc.nextInt();

        boolean resultB = isEven(numB);
        System.out.println(resultB);

        // C:
        System.out.print("Enter a number for task01-C: ");
        int numC = sc.nextInt();

        boolean resultC = isPos(numC); 
        System.out.println(resultC);

        // D:
        System.out.print("Enter a number for task01-D: ");
        int numD = sc.nextInt();

        sequence(numD);

        sc.close();
    }

    // A:
    public static void evenChecker(int num)
    {
        if(num%2==0)
        {
            System.out.println("Even!!!");
        }
        else
        {
            System.out.println("Odd!!!");
        }
    }

    // B:
    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // C:
    public static boolean isPos(int num)
    {
        if(num>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // D:
    public static void sequence(int num)
    {
        if(isPos(num))
        {
            for(int i=0; i<=num; i++)
            {
                if(isEven(i))
                {
                    System.out.print(i + " ");
                }
            }
        }
        else
        {
            for(int i=num; i<0; i++)
            {
                if(!isEven(i))
                {
                    System.out.print(i + " ");
                }
            }
        }
    }

}
