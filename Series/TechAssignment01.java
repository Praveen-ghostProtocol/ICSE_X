package Series;



import java.util.Scanner;
/**
 print sum of 1 - x2/2! + x4/4! ..... xn/n!
 */
public class TechAssignment01
{
    public static void main(String[] args)
    {
        //Declartion
        int n;
        int x;
        int sign;
         double numerator;
         double factorial;
         double term;
         double sum;
        Scanner ob = new Scanner(System.in);

        //Initialisation
        sum=0.0;
        sign =1;

        //Prompt and accept n and x from the user
        System.out.println("Enter n value - ");
        n = ob.nextInt();
        System.out.println("Enter x value - ");
        x = ob.nextInt();

        //loop to find sum
        for(int i = 0 ; i<= n ; i+=2)
        {
            numerator = Math.pow(x,i);
            
            factorial=1;
            for(int j=1; j<=i;j++)
            {
                factorial = factorial * j;
            }

            //calcualting term using sign
            term = (numerator/factorial) * sign;

            //adding inner sum to term
            sum = sum + term;
            
            //Changing sign value
            sign = sign * -1;

        }
        System.out.println("The sum of the series is = "+sum);
        ob.close();
    }
}
