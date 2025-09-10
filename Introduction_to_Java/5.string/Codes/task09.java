import java.util.Scanner;
public class task09 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" A strong password is defined by the following criteria:"); 
        System.out.println(" ➢ The password must be at least 8 characters long.");
        System.out.println(" The password must contain characters at least one: ");
        System.out.println(" ➢ Uppercase letters (A-Z)");
        System.out.println(" ➢ Lowercase letters (a-z)");
        System.out.println(" ➢ Digits (0-9)");
        System.out.println(" ➢ Special characters (e.g., !, @, #, $, etc.)");
        
        System.out.print("Now Enter Your New Password: ");
        String password = sc.nextLine();

        int checkerCount = 0;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) 
        {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) 
            {
                hasUpper = true;
            } 
            else if (Character.isLowerCase(c)) 
            {
                hasLower = true;
            } 
            else if (Character.isDigit(c)) 
            {
                hasDigit = true;
            } 
        }

        if(password.length()>=8)
        {
            checkerCount++;
        }
        else
        {
            System.out.println("Password must be at least 8 characters!");
        }

        if(hasUpper==true)
        {
            checkerCount++;
        }
        else
        {
            System.out.println("Password must contain at least one Uppercase letter!");
        }

        if(hasLower==true)
        {
            checkerCount++;
        }
        else
        {
            System.out.println("Password must contain at least one Lowercase letter!");
        }

        if(hasDigit==true)
        {
            checkerCount++;
        }
        else
        {
            System.out.println("Password must contain at least one Digit!");
        }

        hasSpecial = password.matches(".*[^a-zA-Z0-9 \t\n].*"); //excluded spaces, tabs, and newlines from counting as special characters ( \t\n).
        if(hasSpecial==true)
        {
            checkerCount++;
        }
        else
        {
            System.out.println("Password must contain at least one Special Character!");
        }

        if(checkerCount==5)
        {
            System.out.print("You have made a perfect password. Thank you.");
        }
        else
        {
            System.out.print("Please try again.");
        }

        sc.close();
    }    
}
