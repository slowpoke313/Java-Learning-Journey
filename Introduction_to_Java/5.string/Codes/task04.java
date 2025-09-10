import java.util.Scanner;
public class task04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        String res = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            res = res + str.charAt(i);
        }

        System.out.print("Your Reversed String is: " + res);
        sc.close();
    }   
}
