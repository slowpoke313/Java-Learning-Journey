import java.util.Scanner;
public class task03 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the splitter: ");
        char splitter = sc.next().charAt(0);
        String res = "";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==splitter)
            {
                System.out.println(res);
                res = "";
            }
            else
            {
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
        sc.close();
    }    
}
