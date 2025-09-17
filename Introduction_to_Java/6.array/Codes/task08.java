import java.util.Scanner;
public class task08 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array1: ");
        int size1 = sc.nextInt();
        int array1[] = new int[size1];

        for(int i=0; i<size1; i++)
        {
            System.out.print("Enter number " + (i+1) + " element of array1: ");
            array1[i] = sc.nextInt();
        }
        
        System.out.print("Enter the size of array2: ");
        int size2 = sc.nextInt();
        int array2[] = new int[size2];

        for(int j=0; j<size2; j++)
        {
            System.out.print("Enter number " + (j+1) + " element of array2: ");
            array2[j] = sc.nextInt();
        }

        boolean[] checked = new boolean[size1];
        int found = 0;

        for(int j=0; j<size2; j++)
        {
            for(int i=0; i<size1; i++)
            {
                if(array2[j]==array1[i] && checked[i]==false)
                {
                    found++;
                    checked[i] = true;
                    break;
                }
            }
        }

        if(found==size2)
        {
            System.out.println("Array2 is a subset of Array1.");
        }
        else
        {
            System.out.println("Array2 is not a subset of Array1.");
        }

        sc.close();
    }
}