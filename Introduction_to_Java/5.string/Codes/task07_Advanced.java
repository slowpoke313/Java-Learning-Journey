//This code handles duplicate letters in the word!
import java.util.Scanner;
public class task07_Advanced
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

        for(int i=0; i<str1.length(); i++)
        {
            if(str2.indexOf(str1.charAt(i))==-1 && res.indexOf(str1.charAt(i))==-1)
            {
                res = res + str1.charAt(i);
            }
        }

        for(int i=0; i<str2.length(); i++)
        {
            if(str1.indexOf(str2.charAt(i))==-1 && res.indexOf(str2.charAt(i))==-1)
            {
                res = res + str2.charAt(i);
            }
        }

        System.out.print(res.toUpperCase());
        sc.close();
    }    
}
