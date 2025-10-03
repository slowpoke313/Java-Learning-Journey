import java.util.Scanner;
public class task12 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in Inch: ");
        double inch = sc.nextDouble();

        // A:
        double t = convertToCm(inch);
        System.out.println(String.format("%.2f", t) + " cm");

        // B:
        System.out.print("How many cheetos do you want to measure: ");
        int size = sc.nextInt();
        System.out.println("Enter the sizes of the cheetos one by one(in inches): ");
        double[]  cheetos_inches  =  new  double[size];
        for(int i=0; i<size; i++)
        {
            cheetos_inches[i] = sc.nextDouble();
        } 
        double averageLength = findAvgCm(cheetos_inches);
        System.out.println("The average Cheeto length is " + String.format("%.2f",averageLength) + " cm");

        sc.close();
    }    

    // A:
    public static double convertToCm(double val)
    {
        return 2.54*val;
    }

    // B:
    public static double findAvgCm(double[] cheetos_inches)
    {
        double total = 0;
        for(int i=0; i<cheetos_inches.length; i++)
        {
            total = total + convertToCm(cheetos_inches[i]);
        }

        return (total/cheetos_inches.length);
    }


}
