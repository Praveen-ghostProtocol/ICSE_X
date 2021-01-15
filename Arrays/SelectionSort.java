package Arrays;

import java.util.*;
/**
class to perform linear search
 */
public class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ob.nextInt();
        int[] a = new int[n];

        System.out.println("Enter "+n+" integers");
        //loop to accept array
        for(int i=0;i<a.length;i++)
        {

            a[i]=ob.nextInt();
        }

        //loop to check if the key is present in the loop
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

        //loop to display array
        System.out.println("The array after sorting is:");
        for(int i=0;i<a.length;i++)
        {

            System.out.print(a[i]+ " ");
        }
        ob.close();
    }
}
