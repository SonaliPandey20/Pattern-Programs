public class PatternProgram38 
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            int n = 5;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(n);
                n--;
            }
            System.out.println();
        }
    }
}
