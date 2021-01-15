package Patterns;



/**
1
2 3 
3 4 5
4 5 6 7
 */
public class Pattern1
{
    public static void main()
    {
        int k=2;
        for(int i=1;i<=4;i++)
        {
            k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
