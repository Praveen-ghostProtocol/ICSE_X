package Methods;


import java.util.*;
public class BookFair
{
    String Bname;
    double price;
    
    BookFair()
    {
        Bname="";
        price = 0.0;
    }
    
    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name of book");
        Bname = ob.nextLine();
        System.out.println("enter the price of the books");
        price = ob.nextDouble();
        ob.close();
    }
    
    void calculate()
    {
        double discount = 0.0; 
        if(price<=1000)discount = (2.0/100.0)*price;
        else if(price>1000&&price<=3000)discount = (10.0/100.0)*price;
        else if(price>3000)discount = (15.0/100.0)*price;
        price-=discount;
    }
    
    void display()
    {
        System.out.println("Name of the book is "+Bname);
        System.out.println("Price after discount "+ price);
    }
    
    public static void main()
    {
        BookFair ob = new BookFair();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
