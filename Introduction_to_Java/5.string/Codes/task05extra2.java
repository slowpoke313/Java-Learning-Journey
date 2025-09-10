//Used replaceAll() method with regex
import java.util.Scanner;
public class task05extra2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the phrase: ");
        String phrase = sc.nextLine();
        phrase = phrase.toLowerCase();

        String vowelString = phrase.replaceAll("[^aeiou]", "");
        int vowelCount = vowelString.length();

        String consonantString = phrase.replaceAll("[^bcdfghjklmnpqrstvwxyz]", "");
        int consonantCount = consonantString.length();

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
