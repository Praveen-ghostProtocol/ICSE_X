package Methods;


import java.util.*;
/**
 magic number program
 */
public class Magic
{
    int n;
    Magic(int number)
    {
        n= number;
    }
    void checkPrint()
    {
        int sum=0;
        int digit =0;
        while(n>9)
        {
            sum=0;
            while(n!=0)
            {
                digit = n%10;
                sum+=digit;
                n/=10;
            }
            n=sum;
        }
        if(n==1)
        {
            System.out.println("The entered number is a magic number");
        }
        else
        {
            System.out.println("The entered number is not a magic number");
        }
    }
    
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the value of the number");
        int n = ob.nextInt();
        Magic obj = new Magic(n);
        obj.checkPrint();
        ob.close();
    }
}
