import java.util.Scanner;
public class task06 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        
        String res = "";
        String word = "";

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==' ')
            {
                res = word + " " + res;
                word = "";
            }
            else
            {
                word = word + str.charAt(i);
            }
        }

        res = word + " " + res;
        System.out.println("Reversed sentence is: " + res.trim());
        sc.close();
    }    
}
// Can be done using array + split() + loop. That would better. As we don't know about array yet therefore we are skipping that solution for now. You are most welcome to try it.