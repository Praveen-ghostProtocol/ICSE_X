package Methods;


import java.util.*;
/**
 * Write a description of class DN_Q12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookFair02
{
    String BName;
    double price;
    
    public BookFair02()
    {
        BName = "";
        price=0.0;
    }
    
    public void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the name of the book");
        BName = ob.nextLine();
        System.out.println("Enter the price of the book");
        price = ob.nextDouble();
        ob.close();
    }
    
    public void calculator()
    {
        
        if(price<=1000)
        {
            price -= (price*2.0)/100;
        }
        else if(price>1000&&price <=3000)
        {
            price -= (price*10.0)/100;
        }
        else
        {
            price -= (price*15.0)/100;
        }
    }
    public void display()
    {
        System.out.println("The name of the book is : "+BName);
        System.out.println("The price of the book is : "+price);
    }
    
    public static void main()
    {
        BookFair02 obj = new BookFair02();
        obj.input();
        obj.calculator();
        obj.display();
    }
}
