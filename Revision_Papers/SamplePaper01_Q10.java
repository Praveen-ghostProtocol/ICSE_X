import java.util.Scanner;

public class SamplePaper01_Q10 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array 1");
        int m = input.nextInt();
        System.out.println("Enter the size of array 2");
        int n = input.nextInt();

        int[] A = new int[m];
        int[] B = new int[n];
        int len = m+n;
        int[] C = new int[len];

        System.out.println("Enter "+m+" elements of the first array");
        for(int i=0;i<A.length;i++)
        {
            A[i]=input.nextInt();
        }
        System.out.println("Enter "+n+" elements of the second array");
        for(int i=0;i<B.length;i++)
        {
            B[i]=input.nextInt();
        }

        int pos=0;
        for (int i=0;i<A.length;i++)   
        {  
            C[pos] = A[i];  
            pos++;              
        }  
        for (int  i=0;i<B.length;i++)  
        {  
            C[pos] = B[i];  
            pos++;  
        }  
        
        System.out.println("The merged array is");
        for(int i=0;i<C.length;i++)
        {
            System.out.println(C[i]+" ");
        }
        input.close();
    }
}
