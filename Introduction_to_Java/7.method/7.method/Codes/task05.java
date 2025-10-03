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

        double t =  calcTax  (age,salary); 
        System.out.println(String.format("%.2f", t));
        sc.close();
    }    

    public static double calcTax(int age, int salary)
    {
        if(age<18 || salary<10000)
        {
            return 0.0;
        }
        else if(salary<=20000)
        {
            return salary * (7.0/100.0);    
        }
        else
        {
            return salary * (14.0/100.0);
        }
    }
}
