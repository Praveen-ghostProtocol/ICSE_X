import java.util.Scanner;

public class SamplePaper01_Q6 
{
    static double price ;
    static double discount;
    static double finalPrice;
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("1.America - Rs.50,000");
        System.out.println("2.Singapore - Rs.20,000");
        System.out.println("3.Japan - Rs.40,000");
        System.out.println("4.Thailand - Rs.30,000");
        System.out.println("Enter the first letter of you destination");
        char uc = input.next().charAt(0);
        input.nextLine();//flushing out the enter key
        System.out.println("Enter the name of the passenger/ group head");
        String name = input.nextLine();
        System.out.println("Enter the Number of tickets");
        int num = input.nextInt();

        switch(uc)
        {
            case 'a':
            case 'A':
            price = 50000.0*num;
            break;

            case 'S':
            case 's':
            price = 20000.0*num;
            break;

            case 'J':
            case 'j':
            price = 40000.0*num;
            break;

            case 'T':
            case 't':
            price = 30000.0*num;
            break;

            default:
            System.out.println("Wrong number Entered, Please try again,Thank You!");
        }
        input.close();
        finalPrice = price - calculate();

        System.out.println("Welcome "+name);
        System.out.println("You have booked tickets for "+num+" passenger/s");
        System.out.println("You have chosen to travel to code "+uc);
        System.out.println("Congrats!, You have received a discount of "+discount);
        System.out.println("The final amount you have to pay is "+finalPrice);

    }
    public static double calculate()
    {
        if(price > 20000.0)
        {
            discount = (25.0/100.0)*price;
        }
        else if(price > 15000.0 && price <= 20000.0)
        {
            discount = (20.0/100.0)*price;
        }
        else if(price > 10000.0 && price <= 15000.0)
        {
            discount = (15.0/100.0)*price;
        }
        else if(price <= 10000.0)
        {
            discount = (10.0/100.0)*price;
        }
        return discount;
    }

}
