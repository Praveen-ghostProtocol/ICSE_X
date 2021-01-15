package Arrays;


/**
 input : 2 5 4 4 3 8 12 7 29 6
 output : min value = 2
          max value = 29
          sum of even elements = 34
 */
public class Min_Max
{
    public static void main(int[] arr)
    {
        int n = arr.length;
        int ioh=0,iol=0,sum=0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>arr[ioh])
            {
                ioh=i;
            }
            if(arr[i]<arr[iol])
            {
                iol=i;
            }
            if(arr[i]%2==0)
            {
                sum += arr[i];
            }
        }
        System.out.println("Minimum value: " + arr[iol]);
        System.out.println("Maximum value: " + arr[ioh]);
        System.out.println("Sum of even elements: " + sum);
    }
}
