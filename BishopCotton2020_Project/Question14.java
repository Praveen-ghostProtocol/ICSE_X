import java.util.Scanner;

public class Question14 
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        int[] A = new int[15];
        int[] P = new int[15];
        int[] N = new int[15];

        System.out.println("Enter "+A.length+" intergers");
        for(int i=0;i<A.length;i++)
        {
            A[i] = input.nextInt();
        }

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0  && A[i]%2==0)
            {
                P[i] = A[i];
            }
            else if (A[i] < 0 && A[i] % 2 != 0) 
            {
                N[i] = A[i];
            }
        }

        System.out.println("The Positive even integer array is ");
        for(int i=0;i<P.length;i++)
        {
            if(P[i]!=0)
            {
                System.out.println(P[i]);
            }
        }
        System.out.println("The Negative odd integer array is ");
        for (int i = 0; i < N.length; i++) 
        {
            if (N[i] != 0) {
                System.out.println(N[i]);
            }
        }
        input.close();
    }
}
