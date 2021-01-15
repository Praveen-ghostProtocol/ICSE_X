package Methods;


import java.util.*;

public class Product
{
    long num;
    
    Product()
    {
        num =123498;
    }
    
    long ProductOfDigits()
    {
        long Product = 1;
        long n = num;
        
        while(n>0)
        {
            Product*= (n%10);
            n/=10;
        }
        return Product;
    }
    public static void main()
    {
        Scanner ob= new Scanner(System.in);
        Product obj = new Product();
        System.out.println("The product of the digits is "+obj.ProductOfDigits());
        ob.close();
    }
}
