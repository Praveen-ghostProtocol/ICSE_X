package Patterns;



/**
1
3 5 
5 7 9
7 9 11 13
 */
public class Pattern2
{
    public static void main()
    {
        int k;
        int a=1;
        for(int i=1;i<=4;i++)
        {
            k=a;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
            a+=2;
        }
    }
}