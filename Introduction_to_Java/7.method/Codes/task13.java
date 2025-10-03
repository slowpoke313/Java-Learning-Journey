import java.util.Scanner;
public class task13 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        // A:
        int vowelCount = isVowel(sentence);
        System.out.println("Number of vowel in the string: " + vowelCount);

        // B:
        int consonantCount = isConsonant(sentence);
        System.out.println("Number of consonant in the string: " + consonantCount);

        // C:
        System.out.print("How many strings would you like to enter: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];
        System.out.println("Enter the strings one by one: ");

        for(int i=0; i<size; i++)
        {
            names[i] = sc.nextLine();
        }
        
        System.out.println("The total number of vowels in the array is: " + vowelSum(names));
        System.out.println("The total number of consonant in the array is: " + consonantSum(names));

        sc.close();
    }    

    // A:
    public static int isVowel(String str)
    {
        str = str.toLowerCase();
        String vowels= "aeiou";
        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            if(vowels.indexOf(str.charAt(i)) != -1)
            {
                count++;
            }
        }

        return count;
    }

    // B:
    public static int isConsonant(String str)
    {
        str = str.toLowerCase();
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            if(consonants.indexOf(str.charAt(i)) != -1)
            {
                count++;
            }
        }

        return count;
    }

    // C:
    public static int vowelSum(String[] array)
    {
        int vowelCount = 0;
        for(String str : array)
        {
            vowelCount = vowelCount + isVowel(str);
        }

        return vowelCount;
    }

    public static int consonantSum(String[] array)
    {
        int consonantCount = 0;
        for(String str : array)
        {
            consonantCount = consonantCount + isConsonant(str);
        }

        return consonantCount;
    }
}
