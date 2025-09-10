import java.util.Scanner;
public class task10 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String res;
        int counter = 0;

        System.out.println("Substrings of the given string are: ");
        for(int i=0; i<str.length(); i++)
        {
            res = "";
            for(int j=i; j<str.length(); j++)   //Can be done with str.substring() function as well.
            {
                res = res + str.charAt(j);
                System.out.println(res);

                if(res.charAt(0) == res.charAt(res.length()-1))
                {
                    counter++;
                }
            }
        }

        System.out.println("The number of substrings that starts and ends with the same character is: " + counter);

        sc.close();
    }    
}
