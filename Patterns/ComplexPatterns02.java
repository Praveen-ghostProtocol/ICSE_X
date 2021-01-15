package Patterns;



/**
 * 1234321
 *  12321
 *   121
 *    1
 *   121
 *  12321
 * 1234321
 */
public class ComplexPatterns02
{
    public static void main(String[] args)
    {
        //Upper Half
        for(int i =4;i>=1;i--)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        //Lower Half
        for(int i =2;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
