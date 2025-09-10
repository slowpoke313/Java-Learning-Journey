import java.util.Scanner;
public class task02 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        boolean palindrome = true;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                palindrome = false;
                break;
            }
        }

        if(palindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("NOT a Palindrome");
        }

        sc.close();
    }    
}
