package Methods;


import java.util.Scanner;

/**
 *perfect number prgram wtih methods
 */
public class Perfect
{
    int perfect(int y)
    {
        int num = y;
        int sum = 0;
        for(int i = 1;i<num;i++)
        {
            if(num%i==0)
            {
                sum += i;
            }
        }
        if(sum == num)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
            
    }
    public static void main()
    {
        Perfect obj = new Perfect();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int en = ob.nextInt();
        int m = obj.perfect(en);
        if(m==1)
        {
            System.out.println("Entered number is a perfect number");
        }
        else
        {
            System.out.println("Entered number is not a perfect number");
        }
        ob.close();
    }
        
}
