import java.util.Scanner;
public class task06 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter third string: ");
        String s2 = sc.nextLine();
        String output = modifyStrings(s, s1, s2);
        System.out.print(output);
        sc.close();
    }    

    public static String modifyStrings(String s, String s1, String s2)
    {
        int index = s.indexOf(s1,0);;

        if(s.equals(s1))
        {
            String newString = s.replace(s,s2);
            return newString;    
        }
        else if(index==-1)
        {
            return "no substring match";
        }
        else
        {
            String newString = s.replace(s1,s2);
            return newString;
        }
        
    }
}
