package Series;



import java.util.*;
/**
 \print the series 0 1 1 2 4 7....
 */
public class Tribonacci
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner ob = new Scanner(System.in);
        int n;
        int term1;
        int term2;
        int term3;
        int term4;
        
        // Prompt and accept n value from the user
        System.out.println("Enter the value of n");
        n = ob.nextInt();
        
        //Initialise
        term1=0;
        term2=1;
        term3=1;
        
        System.out.println("series :" + term1 + " "+term2+" "+term3+" ");
        term4= term1 +term2+term3;
        //loop to print the series
        for(int i=4;i<=n;i++)
        {
            System.out.print(term4 + " ");
            
            //Calculating the next term
            term1=term2;
            term2=term3;
            term3=term4;
            term4= term1 +term2+term3;
           
        }
        ob.close();
    }
}
