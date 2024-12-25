public class PatternProgram43 
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            int n=i-1;
            for (int j = 1; j <=i; j++)
            {
                System.out.print((i+n) + " ");
                n+=2;
            }
            System.out.println();
        }
    }
}
