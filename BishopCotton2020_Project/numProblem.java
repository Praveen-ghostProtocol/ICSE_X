import java.util.Scanner;

public class numProblem 
{
    public static int nthPrime(int N)
    {
        int num;
        int count;
        int i;
        num = 1;
        count = 0;

        while (count < N) 
        {
            num = num + 1;
            for (i = 2; i <= num; i++) 
            { 
                if (num % i == 0) 
                {
                    break;
                }
            }
            if (i == num) 
            {
                count = count + 1;
            }
        }
        return num;
    }

    public static void perfectNosBelow(int N)
    {
        int nth = nthPrime(N);
        System.out.println("The "+N+"th prime number is "+nth);
        int sum=0;

        System.out.println("Perfect numbers till "+nth+" are: ");
        for(int i=0;i<=nth;i++)
        {
            sum=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==i)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        int N=0;

        System.out.println("Please enter the value of N");
        N = input.nextInt();

        perfectNosBelow(N);
        input.close();
    }
}
