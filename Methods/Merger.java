package Methods;


import java.util.Scanner;
/**
class to merge two numbers
 */
public class Merger
{
    long n1;
    long n2;
    long merNum;

    Merger()
    {
        n1= 0;
        n2=0;
        merNum=0;
    }
    
    void readNum()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the first number");
        n1 = ob.nextLong();
        System.out.println("Enter the second number");
        n2 = ob.nextLong();
        ob.close();
    }
    
    void joinNum()
    {
        long temp = n2;
        int cnt=0;
        while(temp>0)
        {
            cnt++;
            temp/=10;
        }
        long merger = n1 * (int)Math.pow(10,cnt);
        merNum = merger + n2;
    }
    
    void display()
    {
        System.out.println("The numbers are "+ n1 +" and "+n2);
        System.out.println("Merged number = "+ merNum);
    }
    
    public static void main()
    {
        Merger ob = new Merger();
        ob.readNum();
        ob.joinNum();
        ob.display();
    }
}
