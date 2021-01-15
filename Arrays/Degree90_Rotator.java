package Arrays;

import java.util.*;
/**
 declare a n x n matrix and rotate it by 90 degrees
 */
public class Degree90_Rotator
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the side of the square matrix");
        int n = ob.nextInt();
        
        int[][] arr = new int[n][n];
        System.out.println("enter the array elements");
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = ob.nextInt();
            }
        }
        System.out.println();
        
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<n/2;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ob.close();
    }
}
