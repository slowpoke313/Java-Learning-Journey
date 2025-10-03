import java.util.Scanner;
public class task13 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int vowels = isVowel2(str);
        System.out.println(vowels);
        int consonents = isConsonant2(str);
        System.out.println(consonents);
        String array[] = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        int totalVowelCount = vowelSum(array);
        int totalConsonentCount = consonentSum(array);
        System.out.println("The total number of vowels in the array is: " + totalVowelCount);
        System.out.println("The total number of consonent in the array is: " + totalConsonentCount);
        sc.close();
    }   
    
    public static int isVowel(String str)
    {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(vowels.indexOf(c)!=-1)  //indexOf() returns -1 if it is not found in the given string
            {
                count++;
            }
        }
        return count;
    }

    public static int isConsonant(String str)
    {
        int consonents = 0;
        String vowels = "aeiouAEIOU";
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(Character.isLetter(c) && (vowels.indexOf(c)==-1))
            {
                consonents++;
            }
        }
        return consonents;
    }

    public static int vowelSum(String array[])
    {
        int vowelSum = 0;
        for(int i=0; i<array.length; i++)
        {
            int vowel = isVowel(array[i]);
            vowelSum += vowel;           
        }
        return vowelSum;
    }

    public static int consonentSum(String array[])
    {
        int consonentSum = 0;
        for(int i=0; i<array.length; i++)
        {
            int consonent = isConsonant(array[i]);
            consonentSum += consonent;           
        }
        return consonentSum;
    }

// Below are two same methods of the above ones but they are done by converting the string to array and using enhanced for loop(for each loop).

    public static int isVowel2(String str)
    {
        String vowels = "aeiouAEIOU";
        int count = 0;
        char characterArray[] = str.toCharArray();
        for(char ca: characterArray) //for each element ca in characterArray
        {
            if(vowels.indexOf(ca)!=-1)
            {
                count++;
            }
        }
        return count;
    }

    public static int isConsonant2(String str)
    {
        int count = 0;
        String vowels = "aeiouAEIOU";
        char charecterArray[] = str.toCharArray();
        for(char ca: charecterArray) //for each element ca in characterArray
        {
            if(Character.isLetter(ca) && (vowels.indexOf(ca)==-1))
            {
                count++;
            }
        }
        return count;
    }
}
