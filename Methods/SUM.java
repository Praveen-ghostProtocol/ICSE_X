package Methods;


import java.util.*;

public class SUM
{
    long num;
    
    SUM(long n)
    {
        num =n;
    }
    
    long FindSum()
    {
        long sum = 0;
        long n = num;
        
        while(n>0)
        {
            sum+= (n%10);
            n/=10;
        }
        return sum;
    }
    public static void main()
    {
        Scanner ob= new Scanner(System.in);
        System.out.println("enter a number");
        long n = ob.nextInt();
        SUM obj = new SUM(n);
        System.out.println("The sum of the digits is "+obj.FindSum());
        ob.close();
    }
}
