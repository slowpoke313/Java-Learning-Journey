import java.util.Scanner;
public class task06
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        double[] array = new double[size];

        for(int i=0; i<size; i++)
        {
            System.out.print("Enter element number " + (i+1) + " : ");
            array[i] = sc.nextDouble();
        }

        double min = array[0];
        double max = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        double total = 0;

        
        for(int i=0; i<size; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
                maxIndex = i;
            }
            if(array[i]<min)
            {
                min = array[i];
                minIndex = i;
            }
            total = total + array[i];
        }

        double avg = total/size;

        System.out.println("Maximum valued element is " + max + " found at index " + maxIndex);
        System.out.println("Minimum valued element is " + min + " found at index " + minIndex);
        System.out.println("Summation of all the elements are: " + total);
        System.out.println("Average: " + String.format("%.2f", avg));

        sc.close();

    }    
}
