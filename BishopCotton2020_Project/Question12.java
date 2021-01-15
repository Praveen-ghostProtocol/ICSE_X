
public class Question12 
{
    public static void main(String[] args)
    {
        //Declaration
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = factorial(i+1);
        }
        System.out.println("The array of factorials is as follows");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
    }

    public static int factorial(int i)
    {
        int factorial=1;
        for(int j=1;j<=i;j++)
        {
            factorial*= j;
        }
        return factorial;
    }
}
