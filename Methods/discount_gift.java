package Methods;



import java.util.*;
/**
 *disount and final price and gifts for customers
 */
public class discount_gift
{
    double calculate(String name, double cost)
    {
        double finalAmt=0;
        System.out.println("Welcome "+name);
        if(cost <= 5000)
        {
            finalAmt = cost;
        }
        else if(cost > 5000&& cost <=10000)
        {
            finalAmt = cost - ((10.0/100.0)*cost);
        }
        else if(cost > 10000&& cost <=15000)
        {
            finalAmt = cost - ((15.0/100.0)*cost);
        }
        else if(cost > 15000)
        {
            finalAmt = cost - ((20.0/100.0)*cost);
        }
        
        return finalAmt;
    }

    void calculate(int age)
    {
        if(age<=30)
        {
            System.out.println("Please collect a stationary kit from the office");
        }
        else if(age>30)
        {
            System.out.println("Please collect a juicer from the office");
        }
    }

    void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name");
        String name = ob.nextLine();
        System.out.println("Enter cost");
        double cost =ob.nextDouble();
        calculate(name,cost);
        System.out.println("Enter your age");
        int age = ob.nextInt();
        calculate(age);
        ob.close();
    }
}
