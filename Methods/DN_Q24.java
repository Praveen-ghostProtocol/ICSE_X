package Methods;


import java.util.Scanner;

/**
 *write a function void Sum(int x)
 *i. reverse the number x and store in Y
 *2.add x and y and store in z
 *3. find sum of digits of z and store in s
 *4.print all xyzs
 */
public class DN_Q24
{
    void Sum(int x)
    {
        Scanner ob = new Scanner(System.in);
        int num = x;
        int y=0;
        int z;
        int s;
        int digisum=0;
        int d;
        
        while(num>0)
        {
            d=num%10;
            y = y + (d*10);
            num /= 10;
            
        }
        System.out.println("Entered number is "+x);
        System.out.println("Reversed number is "+y);
        
        z=x+y;
        num =z;
        while(num>0)
        {
            d=num%10;
            digisum = digisum + (d*10);
            num /= 10;
        }
        s= digisum;
        System.out.println("sum of entered number and reversed number is "+z);
        System.out.println("sum of digits of entered number and reversed numbers is "+s);
        ob.close();
    }
    void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter a number ");
        int enteredNumber = ob.nextInt();
        Sum(enteredNumber);
        ob.close();
    }
}
