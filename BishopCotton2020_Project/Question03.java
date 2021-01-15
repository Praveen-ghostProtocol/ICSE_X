
public class Question03 
{
    public static void main(String[] args)
    {
        for (int a = 10; a <= 1000; a++)
        {
            for (int b = a + 1; b <= 1000; b++) 
            {
                for (int c = b + 1; c <= 1000; c++)
                {
                    if (c * c == (a * a + b * b))
                    {
                        System.out.println(a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }
}
