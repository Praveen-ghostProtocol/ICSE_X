
import java.util.*;
public class BubbleSorter8 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 20 numbers");
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        int k=0;
        for(int i =0;i<arr.length;i++)
        {
            if(i<10)
            {
                arr1[i]=arr[i];
            }
            else if(i>=10)
            {
                arr2[k]=arr[i];
                k++;
            }
        }

        //bubble sorting first array
        int n1 = arr1.length;
        for(int i =0; i< n1-1;i++)
        {
            for(int j=0;j<n1-i-1;j++)
            {
                //swapping
                if(arr1[j]>arr1[j+1])
                {
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        //bubble sorting second array
        int n2 = arr2.length;
        for(int i =0; i< n2-1;i++)
        {
            for(int j=0;j<n2-i-1;j++)
            {
                //swapping
                if(arr2[j]<arr2[j+1])
                {
                    int temp = arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        for(int i =0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        for(int i =0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        input.close();
    }
}
