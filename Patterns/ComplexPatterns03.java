package Patterns;


/**
      4
     434
    43234
   4321234
    43234
     434
      4
 */
public class ComplexPatterns03
{
    public static void main(String[] args)
    {
        int k =4;
        for(int i =1;i<=4;i++)
        {
            k=4;
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k--;
            }
            k+=2;
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        for(int i =3;i>=1;i--)
        {
            k=4;
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k--;
            }
            k+=2;
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
