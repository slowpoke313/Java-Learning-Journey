import java.util.Scanner;
public class task04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want to see the last two digits: ");
        int input = sc.nextInt();
        int output = input%100;
        System.out.println(output);
        sc.close();
    }
}