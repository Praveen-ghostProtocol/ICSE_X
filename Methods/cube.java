package Methods;


import java.util.*;
/**
 *cube of entered numbers
 */
public class cube
{
    double cubes(double num)
    {
        return num*num*num;
    }
    void main()
    {
        Scanner ob = new Scanner(System.in);
        int n=0;
        for(int i =1;i<=10;i++)
        {
            System.out.println("enter a number");
            n= ob.nextInt();
            System.out.println("cube of "+n+ "is "+cubes(n));
        }
        ob.close();
    }
}
