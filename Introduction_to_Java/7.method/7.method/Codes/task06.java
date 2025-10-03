import java.util.Scanner;
public class task06
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String S = sc.nextLine();

        System.out.print("Enter second String: ");
        String S2 = sc. nextLine();

        System.out.print("Enter third String: ");
        String S3 = sc.nextLine();

        modifyString(S, S2, S3);
        modifyString2(S, S2, S3);
        modifyString3(S, S2, S3);
        sc.close();
    }    

    // My own amature version of .replace(). Although it works in many cases, but it is more error-prone for multiple occurrences. 
    public static void modifyString(String str1, String str2, String str3)
    {
        String modified = "";

        int indexOfSub = str1.indexOf(str2);
        for(int i=0; i<str1.length(); )
        {
            if(i<indexOfSub)
            {
                modified = modified + str1.charAt(i);
                i++;
            }
            else
            {
                modified = modified + str3;
                i = i + str2.length();
                if(str1.indexOf(str2, i)==-1)
                {
                    indexOfSub = str1.length();
                }
                else
                {
                    indexOfSub = str1.indexOf(str2, i);
                }
            }
        }

        System.out.println(modified);
    }

    // Modified version of my .replace()
    public static void modifyString2(String str1, String str2, String str3)
    {
        String modified = "";
        int idx = 0;
        int found = str1.indexOf(str2);

        while(found != -1)
        {
            modified = modified + str1.substring(idx, found);
            modified = modified + str3;
            idx = found + str2.length();
            found = str1.indexOf(str2,idx);
        }

        modified = modified + str1.substring(idx);

        System.out.println(modified);
    }

    // Shortest and cleanest version
    public static void modifyString3(String str1, String str2, String str3)
    {
        System.out.println(str1.replace(str2, str3));
    }
}
