package Arrays;
import java.util.*;

/**
sorting without using selection sort

 */
public class Sorting_WithoutSelection
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
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        ob.close();
    }
}
