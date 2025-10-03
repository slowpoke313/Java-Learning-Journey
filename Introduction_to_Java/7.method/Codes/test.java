//import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class test 
{
    public static void main(String args[])
    {
        String str = "this is an array";
        char c[] = str.toCharArray();
        System.out.println(Arrays.toString(c));
        for(int i=0; i<c.length; i++)
        {
            System.out.println(c[i]);
        }
        String str2 = "123 234 456";

        String num[] = str2.split(" ");
        int num1 = Integer.parseInt(num[0]);
        System.out.println(num1+1);
        System.out.print(Arrays.toString(num));
    }
}
