import java.util.Scanner;
public class Question11 
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int sum_odd=0;
        int sum_even =0;

        System.out.println("Enter "+arr.length+" integers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                sum_even+= arr[i];
            }
            else
            {
                sum_odd += arr[i];
            }
        }

        System.out.println("The sum of the elements in the odd positions are "+sum_odd);
        System.out.println("The sum of the elements in the even positions are " + sum_even);
        input.close();
    }
}
