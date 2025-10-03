import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class task10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many inputs do you want to give: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        HashMap<Integer, Integer> prime = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> perfect = new HashMap<Integer, Integer>();
        for(int i=0; i<array.length; i++)
        {
            System.out.print("Enter number " + (i+1) + " input: ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for(int i=0; i<array.length; i++)
        {
            int count = 0;
            int sum = 0;
            for(int j=1; j<=array[i]; j++)
            {
                if(array[i]%j==0)
                {
                    count++;    //for checking prime
                    sum = sum + j;  //for checking perfect
                }
                
            }
            
            if(count==2)
            {
                prime.put(i, array[i]);
            }
            if((sum-array[i])==array[i])
            {
                perfect.put(i, array[i]);
            }

        }
        System.out.println("Prime Numbers: ");
        for(int key: prime.keySet())
        {
            System.out.println(key + " : " + prime.get(key));
        }
        System.out.println();
        System.out.println("Perfect Numbers: ");
        for(int key: perfect.keySet())
        {
            System.out.println(key + " : " + perfect.get(key));
        }

        sc.close();
    }
}