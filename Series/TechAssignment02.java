package Series;



import java.util.Scanner;
/**
 program to print the sum of the series 1 + 1+2 + 1+2+3 ..... n
 */
public class TechAssignment02
{
    public static void main(String[] args)
    {
        //Declartion
        int n,sumIN,sumOUT;
        Scanner ob = new Scanner(System.in);
        
        //Initialisation
        sumOUT=0;
        
        
        //Prompt and accept n from the user
        System.out.println("Enter n value - ");
        n = ob.nextInt();
        
        //loop to find sum
        for(int i = 1 ; i<= n ; i++)
        {
            sumIN=0;
            for(int j=1; j<=i;j++)
            {
                sumIN = sumIN + j;
            }
            
            //adding inner sum to outer sum
            sumOUT = sumOUT + sumIN;
            
        }
        System.out.println("The sum of the series is = "+sumOUT);
        ob.close();
    }
}
