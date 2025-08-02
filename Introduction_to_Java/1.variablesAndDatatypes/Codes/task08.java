import java.util.Scanner;
public class task08 
{
    public static void main(String[] args)
    {
        System.out.println("Output of this following Eqn will be calculated: {2b x (c-a)/3}+7");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int output = ( (2*b) * ((c-a)/3) ) + 7;
        System.out.print("Output: " + output);
        sc.close();



    }
    
}
