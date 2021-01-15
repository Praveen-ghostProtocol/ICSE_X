package Series;



import java.util.*;
/**
1 - (1*2) + 1*2*3 - 1*2*3*4 ...... n terms
 */
public class TechAssignment05
{
    public static void main(String[] args)
    {
        //Declaration 
        Scanner ob= new Scanner(System.in);
        int n;
        int term;
        int sign;
        int sum;
        int k;

        //Prompt and accept n from the user
        System.out.println("Enter the value of n");
        n= ob.nextInt();

        //Initialisation
        sign = -1;
        term= 1;
        sum =0;
        k=2;

        //Loop to find the sum of the series
        for(int i=1;i<=n;i++)
        {
            sum = sum+ term;
            term = term * k * sign;
            sign = sign * -1;

        }
        System.out.println("sum of the series till the entered number of terms is= "+ sum);
        ob.close();
    }
}
