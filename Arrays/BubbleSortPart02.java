package Arrays;

import java.util.*;
/**
class to perform bubble sort
 */
public class BubbleSortPart02
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

        
        //loop to sort the array
        for(int i = 0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    //Swap the 2 elements
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
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
