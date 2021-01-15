import java.util.Scanner;

public class function
{
    double series(double n)
    {
        double sum=0.0;
        for(int i =1;i<=n;i++)
        {
            sum += 1.0/ factorial(i);
        }
        return sum;
    }
    double series(double x, double n)
    {
        double sum = 0.0;
        for(int i =1;i<=n;i++)
        {
            sum+= Math.pow(x,i)/(i*i);
        }
        return sum;
    }
    double factorial(double n)
    {
        double fact =1;
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        function obj = new function();
        Scanner input = new Scanner(System.in);
        System.out.println("1. sum of 1+ 1/2! ... 1/n!");
        System.out.println("2. sum of x/1+ x^2/4 ... x^n/n^2");
        System.out.println("Enter your choice");
        int uc= input.nextInt();

        switch(uc)
        {
            case 1:
            {
                System.out.println("Enter the value of n");
                System.out.println(obj.series(input.nextInt()));
                break;
            }
            case 2:
            {
                System.out.println("Enter the value of x and n");
                System.out.println(obj.series(input.nextInt(), input.nextInt()));
                break;
            }
            default:
            {
                System.out.println("Wrong Number entered please try again");
            }
        }
        input.close();
    }
}