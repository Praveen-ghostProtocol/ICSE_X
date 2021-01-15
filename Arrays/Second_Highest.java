package Arrays;

import java.util.*;
/**
class to perform selection sort and find the second highest element in the array
 */
public class Second_Highest
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ob.nextInt();
        int[] a = new int[n];
        if(n<2)
        {
            System.out.println("invalid input");
            System.exit(0);
            ob.close();
            return;
            
        }

        System.out.println("Enter "+n+" integers");
        //loop to accept array
        for(int i=0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }

        //loop to perform selection sort
        for(int i = 0;i<n-1;i++)
        {
            int smallest = a[i];
            int ios = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<smallest)
                {
                    smallest = a[j];
                    ios = j;
                }
            }

            //Swap the 2 elements
            int temp = a[i];
            a[i]=a[ios];
            a[ios]=temp;
        }

        for (int i = n - 2; i >= 0; i--) 
        { 
            if (a[i] != a[n - 1])
            { 
                System.out.println("The second largest element is "+ a[i]); 
                System.exit(0);
            } 
        } 
        System.out.println("There is no second largest element in the array");

        //loop to display second highest element in the array
        ob.close();
    }
}
