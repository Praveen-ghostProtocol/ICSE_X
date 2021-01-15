package loops;

/**
 */
public class ROHIT
{
    public static void main(String[] args)
    {
        int digits = 9;
        String n = "ROHIT";

        //loop to print the upper half of the pattern
        for(int i = 0; i<=4;i++)
        {
            //left part of the upper half
            for(int j=0;j<=(i-1);j++)
            {
                System.out.print(n.charAt(j)+ " ");
            }

            //middle part of the upper half
            for(int j=0;j<=(digits-1);j++)
            {
                System.out.print(n.charAt(i)+ " ");
            }

            //right part of the upper half
            for(int j=i-1;j>=0;j--)
            {
                System.out.print(n.charAt(j)+ " ");
            }
            digits-=2;
            System.out.println();
        }

        digits=3;
        //loop to print the lower half of the pattern
        for(int i = 3; i>=0;i--)
        {
            //left part of the lower half
            for(int j=0;j<=(i-1);j++)
            {
                System.out.print(n.charAt(j)+ " ");
            }

            //middle part of the lower half
            for(int j=0;j<=(digits-1);j++)
            {
                System.out.print(n.charAt(i)+ " ");
            }

            //right part of the lower half
            for(int j=(i-1);j>=0;j--)
            {
                System.out.print(n.charAt(j)+ " ");
            }
            digits+=2;
            System.out.println();
        }
    }

}
