import java.util.Scanner;
public class task07 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter element number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }
        
        boolean[] isDuplicate = new boolean[size];
        int duplicateCounter = 0;

        for(int i=0; i<size; i++)
        {
            if(isDuplicate[i]==false)
            {
                for(int j=i+1; j<size; j++)
                {
                    if(array[i]==array[j])
                    {
                        isDuplicate[j] = true;
                        duplicateCounter++;
                    }
                }
            }
        }

        int[] uniqueArray = new int[size-duplicateCounter];

        int j = 0;
        for(int i=0; i<size; i++)
        {
            if(isDuplicate[i]==false)
            {
                uniqueArray[j] = array[i];
                j++;
            }
        }

        for(int i=0; i<uniqueArray.length; i++)
        {
            System.out.print(uniqueArray[i] + " ");
        }
        
        sc.close();
    }    
}
