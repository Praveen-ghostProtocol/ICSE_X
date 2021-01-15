import java.util.Scanner;

public class Question13 
{
    public static void main(String[] args)
    {
        //Declaration 
        Scanner input = new Scanner(System.in);
        String[] arr = new String[10];
        int pos=0;
        

        System.out.println("Enter "+arr.length+" integers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = input.nextLine();
        }

        System.out.println("Enter the position from which the number should be deleted");
        pos = input.nextInt();
        arr[pos]=null;

        System.out.println("The array after deleting the position element");
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] != null)
            {
                System.out.println(arr[i]);
            }
        }
        input.close();
    }
}
