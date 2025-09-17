import java.util.Scanner;
public class task03b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        int temp;

        for(int i=0; i<size; i++)
        {
            System.out.print("Enter element number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }

        
        System.out.println("Original Array:");
        for(int i=0; i<size; i++)
        {
            System.out.print(array[i] + " ");
        }

        for(int i=0; i<size/2; i++)
        {
            temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }

        System.out.println();
        System.out.println("Reversed Array using the original array:");
        for(int i=0; i<size; i++)
        {
            System.out.print(array[i] + " ");
        }

        sc.close();

    }    
}
