public class task02 
{
    public static void main(String args[])
    {
        int arr[] = {9,-5, 7, 9,-5, 5, 7};

        System.out.println("Before removing duplicates:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j] && arr[i]!=0)
                {
                    arr[j] = 0;
                }
            }
        }
        System.out.println();
        System.out.println("After removing duplicates with 0:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    
}
