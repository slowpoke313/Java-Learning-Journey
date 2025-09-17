import java.util.Scanner;
public class task05
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

        System.out.print("Enter the element you want to find: ");
        int elem = sc.nextInt();

        boolean found = false;
        for(int i=0; i<size; i++)
        {
            if(array[i]==elem)
            {
                System.out.print(elem + " is at index " + i);
                found = true;
                break;
            }
        }

        if(found==false)
        {
            System.out.print("Element not found!");
        }


        sc.close();

    }    
}
