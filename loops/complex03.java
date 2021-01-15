package loops;


/**
 
 */
public class complex03
{
    public static void main(String[] args)
    {
        int digits = 9;
        
        //loop to print the upper half of the pattern
        for(int i = 1; i<=5;i++)
        {
            //left part of the upper half
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print(j+ " ");
            }
            
             //middle part of the upper half
            for(int j=1;j<=(digits);j++)
            {
                System.out.print(i+ " ");
            }
            
             //left part of the upper half
            for(int j=(i-1);j>=1;j--)
            {
                System.out.print(j+ " ");
            }
            digits-=2;
            System.out.println();
        }
    }
    
}
