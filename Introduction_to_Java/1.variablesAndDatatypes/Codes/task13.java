import java.util.Scanner;
public class task13 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance covered: ");
        float distance = sc.nextInt();
        System.out.print("Enter how many hours it has traveled: ");
        int hour = sc.nextInt();
        System.out.print("Enter how many minutes it has traveled: ");
        int min = sc.nextInt();
        System.out.print("Enter how many seconds it has traveled: ");
        int sec = sc.nextInt();
        float time = hour*3600 + min*60 + sec;
        float speedinKilo = (distance/time)*(3600f/1000f);
        float speedinMile = (distance/time)*(3600f/1609.34f);
        System.out.println("Averege velocity in Kilometers per hour is " + speedinKilo);
        System.out.println("Averege velocity in Miles per hour is " + speedinMile);
        sc.close();
    }    
}
