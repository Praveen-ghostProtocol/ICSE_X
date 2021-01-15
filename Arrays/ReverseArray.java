package Arrays;


/**
 Program to reverse an array and store back in same array
 */
import java.util.Scanner;
public class ReverseArray
{
    public static void main(String[] args)
    {
        //Declare
        Scanner ob = new Scanner(System.in);
        
        //accept n
        System.out.println("Enter the size of array");
        int n = ob.nextInt();
        int[] a =new int[n];
                int temp = 0;
        //accept array elements
        System.out.println("Enter " + n + "integers");
        for(int i= 0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }
        
        //Loop to manipulate
        for(int i=0,b=a.length-1;i<b;i++,b--)
        {
            temp=a[i];
            a[i]=a[b];
            a[b]=temp;
           
        }
        for(int i= 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        ob.close();
    }
}
