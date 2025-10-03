public class task11 
{
    public static void main(String[] args)    
    {
        char[] studentGrades = {'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int[] studentScores = new int[7];

        getScores(studentGrades, studentScores);
        System.out.println("Output Expectation:");
        for(int i=0; i<studentScores.length; i++)
        {
            System.out.println(studentScores[i]);
        }
    }

    public static void getScores(char[] studentGrades, int[] studentScores)
    {
        for(int i=0; i<studentGrades.length; i++)
        {
            switch(studentGrades[i]) 
            {
                case 'A': 
                    studentScores[i] = 100; 
                    break;
                case 'B': 
                    studentScores[i] = 90;  
                    break;
                case 'C': 
                    studentScores[i] = 70;  
                    break;
                default:  
                    studentScores[i] = 0;   
                    break;
            }

        }
    }
}
