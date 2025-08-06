import java.util.Scanner;
public class task04 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many test case you want: ");
        int testCase = sc.nextInt();

        for(int n=0; n<testCase; n++)
        {
            System.out.print("Enter starting integer: ");
            int startNum = sc.nextInt();

            System.out.print("Enter how many odd integers you want: ");
            int amount = sc.nextInt();

            int total = 0;

            for(int i=0; i<amount; i++)
            {
                if(startNum%2==0)
                {
                    startNum++;
                }

                total = total + startNum;
                if(i==amount-1)
                {
                    System.out.print(startNum);
                }
                else
                {
                    System.out.print(startNum + " + ");
                }
                startNum = startNum + 2;
            }
            System.out.println(" = " + total);
        }
        sc.close();
    }    
}
