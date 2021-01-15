package Methods;


import java.util.Scanner;
/**
 * Write a description of class Fruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FruitJuice
{
    int product_code;//stores product code
    String flavour;//stores flavour of the juice
    String pack_type;//stores the type of the pack
    int pack_size;//stores package size
    int product_price;//stores price of the product

    //to initialise data members to 0 and Strings to ""
    FruitJuice()
    {
        product_code=0;
        flavour="";
        pack_type="";
        pack_size=0;
        product_price=0;
    }

    void Input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the product code");
        product_code=ob.nextInt();
        System.out.println("Enter the flavour");
        ob.nextLine();
        flavour=ob.nextLine();
        System.out.println("Enter the type of the pack");
        pack_type=ob.nextLine();
        System.out.println("Enter the size of the pack");
        pack_size=ob.nextInt();
        System.out.println("Enter the product price");
        product_price=ob.nextInt();
        ob.close();
    }

    void discount()
    {
        product_price-=10;
    }

    void display()
    {
        System.out.println("The product code is: "+product_code);
        System.out.println("The flavour of the product is: "+flavour);
        System.out.println("The type of the pack is: "+pack_type);
        System.out.println("The size of the pack is: "+pack_size);
        System.out.println("The price of the product is: "+product_price);
    }
    
    public static void main()
    {
        FruitJuice obj = new FruitJuice();
        obj.Input();
        obj.discount();
        obj.display();
    }
}
