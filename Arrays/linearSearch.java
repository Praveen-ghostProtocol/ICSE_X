package Arrays;

import java.util.*;
/**
 Write a program to accept 10 different numerbs and store them in a single dimensional array, 
 now enter a number and search whether the number 
 is present or not in the given array
 */
public class linearSearch
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
        
        //Declarations
        int position=0;
        boolean flag = false;
        System.out.println("Enter the value of the key");
        int key = ob.nextInt();
        
        //loop to check if the key is present in the loop
        for(int i = 0;i<a.length;i++)
        {
            if(key == a[i])
            {
                position = i+1;
                flag = true; 
                break;
            }
        }
        
        if(flag == true)
        {
            System.out.println("key found at position "+position);
        }
        else
        {
            System.out.println("key not found!!");
        }
        ob.close();
    }
}
