public class PatternProgram32 
{ 
    public static void main(String[] args)
    {
        int n = 5; 
        char st='A';
        for (int i = 0; i < n; i++)
        {
            char ch= (char) (st + i);
            for (int j = 0; j < n; j++)
            {
                System.out.print(ch + " ");
                ch+=5;
            }
            System.out.println();
        }
    }
}
