package Arrays;
import java.util.*;

/**
take a double array truncate the integer and store in a 
 */
public class Squarechecker
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int[] A = new int[2];
        int[] B = new int[A.length];

        System.out.println("Enter "+A.length+" numbers");
        for(int i =0;i<A.length;i++)
        {
            A[i]=ob.nextInt();
            for(int j=0;j<A[i];j++)
            {
                if((j*j)==A[i])
                {
                    B[i]=(int)A[i];;
                }
            }

        }

        System.out.println("Integes which are a sqaure are: ");
        for(int i =0;i<B.length;i++)
        {
            if(B[i]!=0)
            {
                System.out.print(B[i]+" ");
            }
        }
        ob.close();
    }
}