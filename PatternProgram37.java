public class PatternProgram37 
{
    public static void main(String[] args)
    {
        int n = 5;
        int x=5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(x);
            }
            System.out.println();
            x--;
        }
    }
}
