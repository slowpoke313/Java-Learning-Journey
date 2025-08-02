import java.util.Scanner;
public class task12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student ID: ");
        int input = sc.nextInt();
        int lastDig = input%10;
        input = input/10;
        int secLastDig = input%10;
        System.err.println("last digit is: " + lastDig);
        System.err.println("2nd last digit is:" + secLastDig);
        sc.close();
    }
}
