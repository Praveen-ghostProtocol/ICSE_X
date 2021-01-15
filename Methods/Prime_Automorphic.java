package Methods;



import java.util.*;
/**
 use switch case to show whether the number is prime or autmorphic
 */
public class Prime_Automorphic
{
    public static void main(int n)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("1.Prime Number");
        System.out.println("1.Automorphic Number");
        System.out.println("Enter your choice");
        int UC = ob.nextInt();
        
        switch(UC)
        {
            case 1:
            int cnt=0;
            for(int i =1;i<=n;i++)
            {
                if(n%i==0)cnt++;
            }
            if(cnt==2)System.out.println("The Number is a prime number");
            else System.out.println("The Number is not a prime number");
            break;
            
            case 2:
            {
                int sqr = n*n;
                String s1 = Integer.toString(n);
                String s = Integer.toString(sqr);
                if(s.endsWith(s1))System.out.println("The Number is a Atuomorphic number");
                else System.out.println("The Number is not a Atuomorphic number");
                break;
            }
            

            default :
            System.out.println("Wrong Input sorry");

        }
        ob.close();
    }
}
