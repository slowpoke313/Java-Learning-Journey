import java.util.Scanner;
public class task06 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num>0)
        {
            switch(num%2)
            {
                case 0:
                System.out.print("The Number is positive and even");
                break;
                case 1:
                System.out.print("The Number is positive and odd");
                break;
            }
            
        }
        else if(num==0)
        {
            System.out.print("The Number is Zero");
        }
        else
        {
            System.out.print("The Number is negative");
        }
        sc.close();
    }
}