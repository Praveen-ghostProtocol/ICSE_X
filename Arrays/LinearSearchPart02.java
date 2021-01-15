package Arrays;

import java.util.Scanner;
/**
 *program to search a element of an array using linear search
 */
public class LinearSearchPart02
{
    public static void main()
    {
        //Declaration
        Scanner ob = new Scanner(System.in);
        int n;
        int pos=0;
        int key;
        boolean flag = false;

        //Accept size of array from user
        System.out.println("Enter the size of the array");
        n = ob.nextInt();

        //Declare the array 
        int[] a = new int[n];

        //Get array elements from the user
        System.out.println("Enter "+n+" integers");
        for(int i =0;i<a.length;i++)
        {
            a[i] = ob.nextInt();
        }

        //Get the value of key from the user
        System.out.println("Enter the value of key");
        key = ob.nextInt();

        //linear search logic
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == key)
            {
                flag = true;
                pos = i+1;
                break;
            }
        }

        if(flag == true)
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
