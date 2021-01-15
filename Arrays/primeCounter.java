package Arrays;

import java.util.*;
public class primeCounter
{
    public static void main()
    {
        //declaration of scanner class
        Scanner ob = new Scanner(System.in);
        
        //declaration of variables
        int[] arr = new int[5];
        int[] prime = new int[arr.length];
        int cnt=0;
        
        System.out.println("Enter "+ arr.length+" numbers");
        for(int i =0;i<arr.length;i++)
        {
            //storing integer values in array 
            arr[i]=ob.nextInt();
            
            //to reset counter to zero
            cnt=0; 
            
            //loop to check for primes
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    cnt++;
                }
            }
            
            if(cnt==2)
            {
                prime[i]= arr[i];
            }
            
        }
        for(int i =0;i<prime.length;i++)
        {
            if(prime[i]!=0)
            {
                System.out.println(prime[i]+" is prime");
            }
        }
        ob.close();
    }
}