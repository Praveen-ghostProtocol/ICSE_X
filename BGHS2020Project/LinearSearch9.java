import java.util.*;

public class LinearSearch9
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 20 numbers");
        int[] arr= new int[20];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]= input.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int key = input.nextInt();
        int pos=0;
        boolean flag = false;
        for(int i =0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                pos =i;
                flag = true;
            }
        }
        if(flag)
        {
            System.out.println("The key "+key+" was found at "+(pos+1)+" position");
        }
        else
        {
            System.out.println("The key "+key+" was not found ");
        }
        input.close();
    }
}
