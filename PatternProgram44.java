public class PatternProgram44 
{
    public static void main(String[] args)
    {
        int num = 0;
        for (int i = 1; i <= 4; i++) 
        { 
            num+=i;
            for (int j = num; j>num-i; j--) 
            { 
                System.out.print(j + " "); 
            }
            System.out.println(); 
        }
    }
}