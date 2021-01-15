package Series;



import java.util.Scanner;
/**
program to print the sum of the series 1 - 1*2 + 1*2*3 ..... n
 */
public class TechAssignment03
{
    public static void main(String[] args)
    {
        //Declartion
        int n,Factorial,sum,sign,term;
        Scanner ob = new Scanner(System.in);

        //Initialisation
        sum=0;
        sign =1;

        //Prompt and accept n from the user
        System.out.println("Enter n value - ");
        n = ob.nextInt();

        //loop to find sum
        for(int i = 1 ; i<= n ; i++)
        {
            Factorial=1;
            for(int j=1; j<=i;j++)
            {
                Factorial = Factorial * j;
            }

            //calcualting term using sign
            term = Factorial * sign;

            //adding inner sum to outer sum
            sum = sum + term;
            
            //Changing sign value
            sign = sign * -1;

        }
        System.out.println("The sum of the series is = "+sum);
        ob.close();
    }
}
