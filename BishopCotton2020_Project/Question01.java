public class Question01
{
    public static void main(String[] args)
    {
        //declaration
        double sum=0.0;

        //loop to find the sum of the series
        for(int n=10,m=1; n>=1;n--,m++)
        {
            sum += ((factorial(n)- factorial(m))/n);
        }

        System.out.println("The sum of the given series is "+ sum);
    }


    public static double factorial(int i)
    {
        double factorial=1.0;
        for(int j=1;j<=i;j++)
        {
            factorial *= j;
        }
        return factorial;
    }

}