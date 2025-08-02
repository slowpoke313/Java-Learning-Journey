import java.util.Scanner;
public class task05 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many inputs do you want to take?: ");
        int inputNumber = sc.nextInt();

        int num;
        int negCount = 0;
        int posCount = 0;

        for(int i=0; i<inputNumber; i++)
        {
            System.out.print("Enter numer " + (i+1) + ": ");
            num = sc.nextInt();
            if(num>0)
            {
                posCount++;
            }    
            else
            {
                negCount++;
            }
        }

        System.out.println("You have given " + posCount + " Non-negative Number(s).");
        System.out.println("You have given " + negCount + " Negative Number(s).");

        sc.close();
    }    
}
