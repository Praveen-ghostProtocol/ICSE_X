package Arrays;

import java.util.*;
/**
 class to perform Binary search
 */
public class BinarySearch
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
        
        //Declarations and initialisations
        int high = a.length-1;
        int mid=0;
        int low = 0;
        int position=0;
        boolean flag = false;
        System.out.println("Enter the value of the key");
        int key = ob.nextInt();
        
        //loop to check if the key is present in the loop
        while(low<=high)
        {
            mid = (low+high)/2;
            if(key == a[mid])
            {
                position = mid+1;
                flag = true;
                break;
            }
            
            else if(key < a[mid])
            {
                high = mid -1;
            }
            else if(key > a[mid])
            {
                low = mid + 1;
            }
        }
        
        if(flag == true)
        {
            System.out.println(key +" found at position "+position);
        }
        else
        {
            System.out.println(key+" not found!!");
        }
        ob.close();
    }
    
}
