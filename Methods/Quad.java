package Methods;



import java.util.*;
/**
 find roots of a quadratic equation
 */
public class Quad
{
    float a,b,c,d;
    
    Quad(int x,int y, int z)
    {
        a=x;
        b=y;
        c=z;    
        d=0;        
    }
    
    void calculate()
    {
        d= (b*b) - 4*a*c;
        if(d<0)
        {
            System.out.println("roots not possible, roots are imaginary and computer cannot calculate imaginary roots");
        }
        float r1= ((-1*b) + (float)Math.sqrt(d))/(2*a);
        float r2= ((-1*b) - (float)Math.sqrt(d))/(2*a);
        
        System.out.println("The roots of the equation are : "+r1 + " and "+r2 );
    }
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter value of coefficient of x^2");
        int x = ob.nextInt();
        System.out.println("Enter value of coefficient of x");
        int y = ob.nextInt();
        System.out.println("Enter value of constant");
        int z = ob.nextInt();
        
        Quad obj = new Quad(x,y,z);
        obj.calculate();
        ob.close();
    }
}
