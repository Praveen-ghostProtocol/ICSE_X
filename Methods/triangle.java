package Methods;



import java.util.*;
/**
 * identify the type of the triangle
 */
public class triangle
{
    void decide(int x,int y,int z)
    {
        if(x==y&&x==z)
        {
            System.out.println("Triangle is equilateral");
        }
        else if(x==y||x==z||y==z)
        {
            System.out.println("Triangle is Isoceles");
        }
        else
        {
            System.out.println("Triangle is Scalene");
        }
    }
    void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter side 1 ");
        int s1 =ob.nextInt();
        System.out.println("Enter side 2");
        int s2 =ob.nextInt();
        System.out.println("Enter side 3");
        int s3 =ob.nextInt();
        decide(s1,s2,s3);
        ob.close();
    }
    
}
