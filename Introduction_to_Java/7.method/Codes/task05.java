import java.util.Scanner;
public class task05 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        double tax = calcTax(age, salary);
        System.out.print("The calculated tax is: " + String.format("%.2f",tax));
        sc.close();
    }    

    public static double calcTax(int age, int salary)
    {
        double tax = 0;
        if(age>=18)
        {
            if(salary>=10000 && salary<=20000)
            {
                tax = salary * (7.0/100.0); 
                return tax;
            }
            else if(salary>20)
            {
                tax = salary * (14.0/100);
                return tax;
            }
            else
            {
                return tax;
            }
        }
        else
        {
            return tax;
        }
    }
}
