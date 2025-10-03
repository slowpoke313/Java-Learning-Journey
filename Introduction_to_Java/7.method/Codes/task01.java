import java.util.Scanner;
public class task01
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //evenChecker(num);

        // boolean resultB = isEven(num);
        // System.out.println(resultB);

        // boolean resultC = isPos(num);
        // System.out.println(resultC);

        sequence(num);

        sc.close();
    }



    public static void evenChecker(int n)
    {
        if(n%2==0)
        {
            System.out.println("Even!!!");
        }
        else
        {
            System.out.println("Odd!!!");
        }
    }

    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isPos(int n)
    {
        if(n>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void sequence(int n)
    {
        if(isPos(n) == true)
        {
            for(int i=0; i<=n; i++)
            {
                if(isEven(i)==true)
                {
                    System.out.print(i + " ");
                }
            }
        }
        else
        {
            for(int i=n; i<0; i++)
            {
                if(isEven(i)==false)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }

}