package Arrays;

import java.util.*;
public class Sums
{
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        int[] arr = new int[5];
        int sume=0,sumo=0;
        for(int i =0;i<arr.length;i++)
        {
            System.out.println("Enter a number");
            arr[i]=ob.nextInt();
            if(arr[i]%2==0)
            {
                sume+=arr[i];
            }
            else
            {
                sumo=+ arr[i];
            }
        }
        System.out.println("Sum of even elements = "+sume);
        System.out.println("Sum of odd elements = "+sumo);
        ob.close();
    }
}