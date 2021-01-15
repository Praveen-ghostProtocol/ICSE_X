import java.util.Scanner;

public class Question15
{
    public static void main(String[] args)
    {
        //Declaration 
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int key=0;
        int cnt=0;

        System.out.println("Enter "+arr.length+" integers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the number to be searched");
        key = input.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(key+ " found at "+i+" position");
                cnt++;
            }
        }

        if(cnt==0)
        {
            System.out.println(key+" was not found in the array");
        }
        input.close();
    }
}
