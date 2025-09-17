import java.util.Scanner;
public class task03a 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        int[] revArray = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.print("Enter element number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }

        int j = 0;
        for(int i=size-1; i>=0; i--)
        {
            revArray[j] = array[i];
            j++;
        }

        System.out.println("Original Array:");
        for(int i=0; i<size; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Reversed Array using a new Array:");
        for(int i=0; i<size; i++)
        {
            System.out.print(revArray[i] + " ");
        }

        sc.close();

    }    
}
