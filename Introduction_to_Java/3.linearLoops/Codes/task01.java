import java.util.Scanner;
public class task01 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start value of the Arithmetic series: ");
        int startVal = sc.nextInt();
        System.out.print("Number of terms: ");
        int termNumber = sc.nextInt();
        System.out.print("Difference: ");
        int difference = sc.nextInt();
        int i = 1;
        System.out.print(startVal+", ");
        while(i<termNumber)
        {
            startVal = startVal + difference;
            if(i==termNumber-1)
            {
                System.out.print(startVal);    
            }
            else
            {
                System.out.print(startVal + ", ");
            }
            i++;
        }  
        sc.close();
    }    
}
