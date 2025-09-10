import java.util.Scanner;
public class task01 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String res="";
        int n;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                n = str.charAt(i) - 32;
                res = res + (char)n;
            }
            else
            {
                res = res + str.charAt(i);
            }
        }

        System.out.print("The uppercase of the given string is: " + res);
        sc.close();
    }    
}
