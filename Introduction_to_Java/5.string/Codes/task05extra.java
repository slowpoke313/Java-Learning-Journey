//Used String indexOf() function
import java.util.Scanner;
public class task05extra 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the phrase: ");
        String phrase = sc.nextLine();
        phrase = phrase.toLowerCase();

        String vowels= "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        int vowelCount = 0;
        int consonantCount = 0;

        for(int i=0; i<phrase.length(); i++)
        {
            if(vowels.indexOf(phrase.charAt(i)) != -1)
            {
                vowelCount++;
            }
            else if(consonants.indexOf(phrase.charAt(i)) != -1)
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
