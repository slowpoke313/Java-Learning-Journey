import java.util.Scanner;
public class task08 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        String res = "";
        boolean flag=true; // true for lower case and false for upper case

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                if(flag==false)
                {
                    res = res + Character.toUpperCase(str.charAt(i));
                    flag = true;
                }
                else
                {
                    res = res + str.charAt(i);
                    flag = false;
                }
            }
            else
            {
                res = res + str.charAt(i);
            }
        }

        System.out.print("The aLtErNaTiNg CaPs format of the given string is: \n" + res);
        sc.close();
    }    
}
