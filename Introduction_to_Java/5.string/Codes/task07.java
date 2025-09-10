//Can't handle duplicate letters in a single word.
import java.util.Scanner;
public class task07 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        str2 = str2.toLowerCase();
        
        String res = "";
        boolean found;

        for(int i=0; i<str1.length(); i++)
        {
            found = false;
            for(int j=0; j<str2.length(); j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    found = true;
                    break;
                }
            }
            
            if(found==false)
            {
                res = res + str1.charAt(i);
            }
        }

        for(int i=0; i<str2.length(); i++)
        {
            found = false;
            for(int j=0; j<str1.length(); j++)
            {
                if(str1.charAt(j)==str2.charAt(i))
                {
                    found = true;
                    break;
                }
            }

            if(found==false)
            {
                res = res + str2.charAt(i);
            }
        }

        System.out.print(res.toUpperCase());
        sc.close();
    }    
}
