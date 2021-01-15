package Series;



import java.util.Scanner;
/**
program to print the sum of the series 1 - (1+2/1*2) + (1+2+3)/1*2*3) ..... n
 */
public class TechAssignment04
{
    public static void main(String[] args)
    {
        //Declartion
        int n,sign;
        double term,sum,denominator,numerator;
       
        Scanner ob = new Scanner(System.in);

        //Initialisation
        sum=0.0;
        sign =1;
        

        //Prompt and accept n from the user
        System.out.println("Enter n value - ");
        n = ob.nextInt();

        //loop to find sum
        for(int i = 1 ; i<= n ; i++)
        {
            denominator=1;
            for(int j=1; j<=i;j++)
            {
                denominator = denominator * j;
            }
            
            numerator = 0;
            for(int j=1; j<=i;j++)
            {
                numerator = numerator + j;
            }
            
            
            //calcualting term using sign
            term = (numerator/denominator)*sign ;

            //adding term to sum
            sum = sum + term;

            //Changing sign value
            sign = sign * -1;

        }
        System.out.println("The sum of the series is = "+sum);
        ob.close();
    }
}
