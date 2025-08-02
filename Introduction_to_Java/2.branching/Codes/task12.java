import java.util.Scanner;
public class task12 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount the customer needs to pay(Taka): ");
        int bill = sc.nextInt();
        System.out.print("Enter the amount customer gave(Taka): ");
        int paid = sc.nextInt();
        int hundred;
        int fifty;
        int twenty;
        int ten;
        int five;
        int two;
        int left;
        if(paid>bill)
        {
            int change = paid - bill;
            hundred = change/100;
            left = change%100;
            fifty = left/50;
            left = left%50;
            twenty = left/20;
            left = left%20;
            ten = left/10;
            left = left%10;
            five = left/5;
            left = left%5;
            two = left/2;
            left = left%2;
            System.out.println("The return amount is " + change + " taka.");
            System.out.println("100 taka note: " + hundred);
            System.out.println("50 taka note: " + fifty);
            System.out.println("20 taka note: " + twenty);
            System.out.println("10 taka note: " + ten);
            System.out.println("5 taka note: " + five);
            System.out.println("2 taka note: " + two);
            System.out.println("1 taka note: " + left); 
        }
        else if(bill==paid)
        {
            System.out.print("The return amount is 0 taka.");
        }
        else
        {
            int due = bill - paid;
            System.out.print("Please pay " + due + " taka more.");
        }
        sc.close();
    }
}