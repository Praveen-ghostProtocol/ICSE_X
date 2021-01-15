import java.util.Scanner;

public class Question17 
{
    public static int fact(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        
        return fact;
    }

    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        double S = 0;
        int n=0;
        int m=0;

        System.out.println("Please enter the value of n");
        n = input.nextInt();

        System.out.println("Please enter the value of m");
        m = input.nextInt();
        if(n>=m)
        {
            S = fact(n)*1.0 / ((fact(m)*1.0)* (fact(n - m)*1.0));
        }
        else
        {
            System.out.println("Please enter a value of n which is greater than m");
        }
        System.out.println("The value of S is "+S);
        input.close();
    }
}
