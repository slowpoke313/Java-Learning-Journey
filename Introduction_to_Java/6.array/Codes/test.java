import java.util.Arrays;

public class test
{
    public static void main(String args[])
    {
        int[] arr = new int[5];

        for(int num:arr)
        {
            System.out.println(num);
        }

        String str1 = "banana";
        String str2 = "cherry";
        int total = 0;
        int total2 = 0;
        for(int i=0; i<str1.length(); i++)
        {
            total = total + str1.codePointAt(i);
        }
        System.out.println(total);

        for(int i=0; i<str2.length(); i++)
        {
            total2 = total2 + str2.codePointAt(i);
        }

        System.out.println(total2);

        int[] arr2 = {1, 2, 3, 4, 5};
        int[] copy2 = Arrays.copyOfRange(arr2, 1, 8);
        System.out.println(Arrays.toString(copy2)); // [2, 3, 4]
        
    }
}