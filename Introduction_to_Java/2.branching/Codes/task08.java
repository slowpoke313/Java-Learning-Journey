import java.util.Scanner;
public class task08 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        int year = id/1000000;
        int session = (id%1000000)/100000;
        switch(session)
        {
            case 1:
            System.out.print("Student Joined BRAC in Spring " + year);
            break;
            case 2:
            System.out.print("Student Joined BRAC in Fall " + year);
            break;
            case 3:
            System.out.print("Student Joined BRAC in Summer " + year);
            break;
            default:
            System.out.print("Invalid ID");
            break;
        }
        sc.close();
        
    }
}