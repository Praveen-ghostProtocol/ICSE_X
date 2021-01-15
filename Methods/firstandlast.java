package Methods;



/**
 find sum of first and last digits of a number
 */
public class firstandlast
{
    public static long product(long num)
    {
        long number = num;
        int counter = 0;
        long product;
        while(num > 0)
        {
            num = num / 10;
            counter++;
        }
        long last = number % 10;
        long first = number / (int)Math.pow(10,counter);
        product = first * last;
        System.out.println(product);
        return product;
        
    }
}
