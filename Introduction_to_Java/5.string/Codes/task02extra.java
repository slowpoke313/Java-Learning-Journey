import java.util.Scanner;

public class task02extra 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String res = "";
        
        for(int i=str.length()-1; i>=0; i--)
        {
            res = res + str.charAt(i);
        }
        if(str.equals(res))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not palindrome");
        }
        sc.close();
    }     
}
