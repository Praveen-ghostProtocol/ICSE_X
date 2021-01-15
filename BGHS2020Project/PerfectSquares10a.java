import java.util.*;
public class PerfectSquares10a 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr= new int[20];
        System.out.println("Enter 20 numbers");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]= input.nextInt();
        }
        for(int i =0;i<arr.length;i++)
        {
            if( arr[i]%Math.sqrt(arr[i])==0)
            {
                System.out.println(arr[i]+" is a perfect square");
            }
        }
        
        input.close();
    }
}
