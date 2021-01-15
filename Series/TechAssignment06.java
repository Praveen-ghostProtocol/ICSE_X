package Series;



import java.util.*;
/**
1 - (1*2) + 1*2*3 - 1*2*3*4 ...... n terms
 */
public class TechAssignment06
{
    public static void main(String[] args)
    {
        //Declaration 
        Scanner ob= new Scanner(System.in);
        int n;
        int k;
        int sign;

        double num;
        double den;
        double sum;
        double term;

        //Prompt and accept n from the user
        System.out.println("Enter the value of n");
        n= ob.nextInt();

        //Initialisation
        sign = -1;
        term= 1;
        sum =0;
        num = 1;
        den = 1;
        k=2;

        //Loop to find the sum of the series
        for(int i=1;i<=n;i++)
        {
            sum = sum+ term;
            //calculate numerator
            num = num + k;
            
            //calculate denominator
            den = den * k;
            
            term = (num/den) *sign;
            sign = sign * -1;

        }
        System.out.println("sum of the series till the entered number of terms is= "+ sum);
        ob.close();
    }
}
