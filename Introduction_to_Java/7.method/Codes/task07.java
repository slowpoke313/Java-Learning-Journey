import java.util.Scanner;
public class task07 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many email address you want to check: ");
        int size = sc.nextInt();
        String array[] = new String[size];
        for(int i=0; i<array.length; i++)
        {
            System.out.print("Enter number " + (i+1) + " email address: ");
            array[i] = sc.next();
        }

        for(int i=0; i<array.length; i++)
        {
            int atRateCount = 0;
            int charAfterdot = 0;
            String elem = array[i];
            for(int j=0; j<elem.length(); j++)
            {
                if(elem.charAt(j)=='@')
                {
                    atRateCount++;
                    
                    if((elem.charAt(0)>='a' && elem.charAt(0)<='z' || elem.charAt(0)>='A' && elem.charAt(0)<='Z') && (elem.charAt(j+1)>='a' && elem.charAt(j+1)<='z' || elem.charAt(j+1)>='A' && elem.charAt(j+1)<='Z'))
                    {
                        for(int k=j+2; k<elem.length(); k++)
                        {
                            if(elem.charAt(k)=='.')
                            {
                                for(int l=k+1; l<elem.length(); l++)
                                {
                                    if(elem.charAt(l)>='a' && elem.charAt(l)<='z' || elem.charAt(l)>='A' && elem.charAt(l)<='Z')
                                    {
                                        charAfterdot++;
                                    }
                                }
                            }
                        }
                    }                       
                    
                }
            }
            if(atRateCount==1 && charAfterdot>0)
            {
                System.out.println((i+1) + " number email address is correct.");
            }
            else
            {
                System.out.println((i+1) + " number email address is incorrect.");
            }
        }
        sc.close();
    }    
}
