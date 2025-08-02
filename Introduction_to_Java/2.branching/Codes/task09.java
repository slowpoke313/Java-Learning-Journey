import java.util.Scanner;
public class task09 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        float tax;
        if(salary>=10000 && age>18)
        {
            if(salary<=20000)
            {
                tax = salary *(5f/100);
                System.out.print("Your Tax amount is: " + tax + " TK");
            }
            else
            {
                tax = salary *(10f/100);
                System.out.print("Your Tax amount is: " + tax + " TK"); 
            }
        }
        else
        {
            System.out.print("Your Tax amount is: 0 TK");
        }
        sc.close();
    }
}