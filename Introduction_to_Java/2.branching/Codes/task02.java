import java.util.Scanner;
public class task02 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter obtained marks: ");
        double marks = sc.nextDouble();
        if(marks>=0 && marks<50)
        {
            System.out.print("Obtained Grade F");
        }
        else if (marks>=50 && marks<=56) 
        {
            System.out.print("Obtained Grade D");    
        }
        else if (marks>=57 && marks<=69) 
        {
            System.out.print("Obtained Grade C");    
        }
        else if (marks>=70 && marks<=84) 
        {
            System.out.print("Obtained Grade B");    
        }
        else if (marks>=85 && marks<=89) 
        {
            System.out.print("Obtained Grade A-");    
        }
        else if (marks>=90 && marks<=100) 
        {
            System.out.print("Obtained Grade A");    
        }
        else
        {
            System.out.print("Invalid input.");
        }
        sc.close();
    }    
}
