package Arrays;
import java.util.*;

/**
 take a double array truncate the integer and store in a 
 */
public class Truncater
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        double[] A = new double[10];
        int[] B = new int[A.length];
        
        System.out.println("Enter "+A.length+" numbers");
        for(int i =0;i<A.length;i++)
        {
            A[i]=ob.nextDouble();
            B[i]=(int)A[i];
        }
        
        System.out.println("Truncated Integers are: ");
        for(int i =0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
        ob.close();
    }
}
