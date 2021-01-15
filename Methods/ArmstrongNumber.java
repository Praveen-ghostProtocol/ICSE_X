package Methods;



import java.util.Scanner;
/**
 class to check if a number is armstrong or not
 */
public class ArmstrongNumber
{
    static int Armstrong(int n)
    {
        int num=n;
        int sum=0;
        int d=0;
        //loop to calculate sum of squares
        do
        {
             d=n%10;
             sum+= (d*d*d);
             n=n/10;
        }while(n>0);
        
        //checking if number is Armstrong
        if(sum==num)return 1;
        else return 0;    
    }
    
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number ");
        int m = ob.nextInt();
        int output=Armstrong(m);
        if(output==1)
        {
            System.out.println("the given number is an Armstrong Number");
        }
        else
        {
            System.out.println("the given number is not an Armstrong Number");
        }
        ob.close();
    }
    
}

