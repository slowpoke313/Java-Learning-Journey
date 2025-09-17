import java.util.Scanner;
public class task04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

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

        for(int i=0; i<size; i++)
        {
            if(array[i]>0)
            {
                array[i] = 1;
            }
            else if(array[i]<0)
            {
                array[i] = 0;
            }
        }

        System.out.println();
        System.out.println("Modified array:");
        for(int i=0; i<size; i++)
        {
            System.out.print(array[i] + " ");
        }

        sc.close();

    }    
}
