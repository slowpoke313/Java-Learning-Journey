import java.util.Scanner;
import java.util.Arrays;
public class task07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter email addresses to verify(Separate by ', ' if multiple): ");
        String input = sc.nextLine();
        String emails[] = input.split(", ");
        
        for(int i=0; i<emails.length; i++)
        {
            if(checkerByRegex(emails[i]))
            {
                System.out.println(emails[i] + " is a valid email address.");
            }
            else
            {
                System.out.println(emails[i] + " is not a valid email address.");
            }
        }
        
        System.out.println(Arrays.toString(emails));
        sc.close();
    }

    // Solution using Conditions:
    public static boolean checker(String str)
    {
        int idxOfat = str.indexOf("@");

        if(idxOfat==-1 || !Character.isLetter(str.charAt(0)) || str.length()<idxOfat+2 || !Character.isLetter(str.charAt(idxOfat+1)))
        {
            return false;
        }
        
        int idxOfdot = str.lastIndexOf(".");
        if(idxOfdot==-1 || idxOfat>idxOfdot || str.length()<idxOfdot+2 || !Character.isLetter(str.charAt(idxOfdot+1)))
        {
            return false;
        }

        return true;
    }

    // Solution using Regex:
    public static boolean checkerByRegex(String str)
    {
        boolean check = str.matches("^[a-zA-Z].*@[a-zA-Z].*\\..+$");
        if(check)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}