package Methods;



import java.util.Scanner;
/**
 class to check if a number is armstrong or not
 */
public class pronicNumber
{
    static int Pronic(int n)
    {
        int num=n;
        boolean flag= false;
        //loop to calculate the number
        for(int i = 1; i<= n ; i++)
        {
            if((i*(i+1))==num)
            {
                flag = true;
            }
            
        }
        
        //checking if number is Armstrong
        if(flag == true)return 1;
        else return 0;    
    }
    
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number ");
        int m = ob.nextInt();
        int output=Pronic(m);
        if(output==1)
        {
            System.out.println("the given number is an Pronic Number");
        }
        else
        {
            System.out.println("the given number is not an PronicK Number");
        }
        ob.close();
    }
    
}

