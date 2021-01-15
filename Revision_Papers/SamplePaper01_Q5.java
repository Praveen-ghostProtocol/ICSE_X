import java.util.Scanner;

public class SamplePaper01_Q5
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        String S;
        int n;
        int sum=0;
        int uc;

        System.out.println("1.Disarium Number");
        System.out.println("2.Duck Number");
        System.out.println("Enter your choice ");
        uc = input.nextInt();

        switch(uc)
        {
            case 1:
            {
                System.out.println("Enter the number");
                n = input.nextInt();
                int gn = n;
                S = ""+n;  
                int len = S.length();  
                while(gn!=0)
                {
                    int d = gn % 10;
                    sum+= (int)Math.pow(d,len);
                    gn/=10;
                    len--;
                }
                if(sum==n)
                {
                    System.out.println("Disarium Number");
                }
                else
                {
                    System.out.println("Not a Disarium Number");
                }
                break;
            }
            case 2:
            {
                System.out.println("Enter the number");
                n = input.nextInt();
                S = ""+n;
                boolean flag = false;
                for(int i =0;i<S.length();i++)
                {
                    if(S.charAt(i)=='0')
                    {
                        flag = true;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println("Duck Number");
                }
                else
                {
                    System.out.println("Not a Duck Number");
                }
                break;
            }
            default:
            {
                System.out.println("Wrong Number Entered, Please Try Again.Thank You!");
            }
        }
        input.close();
    }
}