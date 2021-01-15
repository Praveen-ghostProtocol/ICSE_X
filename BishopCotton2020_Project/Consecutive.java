import java.util.Scanner;

public class Consecutive 
{
    static int N = 0;
    public static void printSet(int i, int j) 
    {
        for (int k = j; k <= i; k++) 
        {
            System.out.print(k + " ");
        }
        System.out.println(" = " + N);
    }
    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        

        System.out.println("Please enter the value of N");
        N= input.nextInt();

        int start = 1;
        int end = (N + 1) / 2;

        while (start < end) 
        {
            int sum = 0;
            for (int i = start; i <= end; i++) 
            {
                sum = sum + i;
                if (sum == N) 
                {
                    printSet(i, start);
                    break;
                }
                if (sum > N) 
                {
                    break;
                }
            }
            sum = 0;
            start++;
        }
        input.close();
    }

}
