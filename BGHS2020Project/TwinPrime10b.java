import java.util.*;
public class TwinPrime10b 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1= input.nextInt();
        int n2= input.nextInt();
        if(isPrime(n1)&&isPrime(n2)&&(Math.abs(n1-n2)==2))
        {
            System.out.println("The numbers are Twin Prime");
        }
        else
        {
            System.out.println("The numbers are not Twin Prime");
        }
        input.close();
    }
    public static boolean isPrime(int n)
    {
        boolean flag = false;
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                cnt++;
            }
        }
        if(cnt==2)
        {
            flag = true;
        }
        return flag;
    }
}
