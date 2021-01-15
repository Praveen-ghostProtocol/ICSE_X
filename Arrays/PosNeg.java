package Arrays;

import java.util.*;

public class PosNeg
{
    public static void main()
    {

        //declaration of scanner class
        Scanner ob = new Scanner(System.in);

        //declaration of variables
        int[] arr = new int[10];
        int[] neg = new int[arr.length];
        int[] pos = new int[arr.length];
        

        System.out.println("Enter "+ arr.length+" numbers");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=ob.nextInt();
            
            if(arr[i]<0)
            {
                neg[i]=arr[i];
            }
            if(arr[i]>0)
            {
                pos[i]=arr[i];
            }
        }
        for(int i =0;i<neg.length;i++)
        {
            if(neg[i]!=0)
            {
                System.out.print(neg[i]+" ");
            }
        }
        System.out.println();
        for(int i =0;i<pos.length;i++)
        {
            if(pos[i]!=0)
            {
                System.out.print(pos[i]+" ");
            }
        }
        ob.close();
    }
}
