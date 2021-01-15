package loops;


/**
 
 */
public class complex04
{
    public static void main()
    {
        int k=1;
        
        for(int i=5;i>=1;i--)
        {
         
            //Spaces
            for(int j = 1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            
            if(i%2!=0)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k+" ");
                    k++;
                }
                k--;
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k+" ");
                    k--;
                }
                k++;
            }
            
            System.out.println();
        }
    }
}
