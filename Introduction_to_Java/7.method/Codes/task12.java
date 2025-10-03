import java.util.Scanner;
public class task12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 5 cheetos in inches: ");
        double cheetosInches[] = new double[5];
        for(int i=0; i<cheetosInches.length; i++)
        {
            System.out.print("Enter " + (i+1) + " no cheestos length: ");
            cheetosInches[i] = sc.nextDouble();
        }
        double avgCheetosLength = findAvgCm(cheetosInches);
        System.out.print("The average cheetos length is " + String.format("%.2f",avgCheetosLength) + " cm");
        //double length = sc.nextDouble();
        // double cm = convertToCm(length);
        // System.out.print(String.format("%.2f",cm) + " cm");
        sc.close();
    }

    public static double convertToCm(double length)
    {
        double cm = length*2.54;
        return cm;
    }

    public static double findAvgCm(double cheetosInches[])
    {
        double sum = 0;
        for(int i=0; i<cheetosInches.length; i++)
        {
            double lengthInCm = convertToCm(cheetosInches[i]);
            sum = sum + lengthInCm;
        }
        double avg = sum/5;
        return avg;
    }


}