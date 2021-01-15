import java.util.*;

public class ElectricityBill
{
    String n;
    int units;
    double bill;
    void accept()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the customer");
        n = input.nextLine();
        System.out.println("Please enter the number of units consumed");
        units = input.nextInt();
        input.close();
    }
    void calculate()
    {
        if(units <=100)
        {
            bill = 2*units;

        }
        else if(units >100 && units<=300)
        {
            bill = (100*2)+((units-100)*3);
        }
        else if(units >300)
        {
            bill = (102.5/100.0)*((100*2)+(200*3)+((units-300)*5));
        }
    }
    void print()
    {
        System.out.println("Name of the Customer "+n);
        System.out.println("Number of units consumed = "+units);
        System.out.println("Bill amount = "+bill);

        
    }
    public static void main(String[] args)
    {
        ElectricityBill obj = new ElectricityBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}