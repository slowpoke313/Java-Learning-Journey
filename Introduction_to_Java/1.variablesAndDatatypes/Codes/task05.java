import java.util.Scanner;
public class task05 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a value for inch: ");
        float input = sc.nextFloat();
        float output = 0.0254f * input;
        System.out.print(input + " inch is " + output + " meters.");
        sc.close();
    }    
}
