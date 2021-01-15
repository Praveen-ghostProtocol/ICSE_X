package Arrays;

import java.util.Scanner;
/**
program to find the element of the array using binary search
 */
public class BinarySearchPart02
{
    public static void main()
    {
        //Declaration
        Scanner ob = new Scanner(System.in);
        int n;
        int key;
        int pos;
        int mid;
        int low;
        int high;
        boolean flag;

        // Get the size of the array from the user
        System.out.println("Enter the size of the array");
        n = ob.nextInt();

        //Declare the array
        int[] a = new int[n];

        //Get the array elements from the user
        System.out.println("Enter "+n+" integers");
        for(int i =0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }
        
        //getting the key from the user
        System.out.println("Enter the value of key");
        key = ob.nextInt();

        //Initialisation
        low =0;high = a.length;
         pos=0;
        flag = false;

        //binary search code
        while (low<=high)
        {
            mid=(low+high)/2;
            
            if(a[mid]==key)
            {
                flag = true;
                pos = mid+1;
                break;
            }
            
            else if(key<a[mid])
            {
                high = mid-1;
            }
            
            else if(key>a[mid])
            {
                low = mid +1;
            }
        }
        
        if(flag)
        {
            System.out.println(key+" found at "+pos);
        }
        else
        {
            System.out.println(key+" not found ");
        }
        ob.close();
    }
}
