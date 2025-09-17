import java.util.Scanner;
public class task01 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many inputs you want: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.print("Enter element number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }

        int[] newArray = new int[size+1];

        for(int i=0; i<size; i++)
        {
            newArray[i] = array[i];
        }

        System.out.print("Enter another element: ");
        newArray[size] = sc.nextInt();

        System.out.println("The elements of the array are:");

        for(int i=0; i<size; i++)
        {
            System.out.println("Index-" + i + " : " + array[i]);
        }

        System.out.println("After resizing the array:");
        for(int i=0; i<size+1; i++)
        {
            System.out.print(newArray[i] + " ");
        }

        sc.close();
    }    
}
