import java.util.Scanner;
public class task07 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given the number of minutes: ");
        int min = sc.nextInt();
        int yearInMin = 60 * 24 * 365;
        int dayInMin = 60 * 24;
        int years = min / yearInMin;
        int temp = min % yearInMin;
        int days = temp / dayInMin;
        System.out.print(min + " minutes is approximately " + years + " Years and " + days + " days.");
        sc.close();


    }
    
}
