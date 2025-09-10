import java.util.Scanner;
public class task01extra 
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
            n = str.charAt(i);
            if(n<123 && n>96)
            {
                n = n-32;
                res = res + (char)n;
            }
            else
            {
                res = res + (char)n;
            }
        }

        System.out.print(res);
        sc.close();
    }    
}
