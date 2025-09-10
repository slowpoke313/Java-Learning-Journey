// Traditional way to solve. Not very efficient.
import java.util.Scanner;
public class task05 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the phrase: ");
        String phrase = sc.nextLine();
        phrase = phrase.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for(int i=0; i<phrase.length(); i++)
        {
            if(phrase.charAt(i)=='a' || phrase.charAt(i)=='e' || phrase.charAt(i)=='i' || phrase.charAt(i)=='o' || phrase.charAt(i)=='u')
            {
                vowelCount++;
            }
            else if(phrase.charAt(i)>'a' && phrase.charAt(i)<'z')
            {
                consonantCount++;
            }
        }

        if(vowelCount>0 && vowelCount%3==0 && consonantCount>0 && consonantCount%5==0)
        {
            System.out.println("Aaarr! Me Plunder!! (Chest Opens)");
        }
        else
        {
            System.out.println("Blimey! No Plunder!! (Chest Didn't Open)");
        }

        sc.close();
    }    
}
