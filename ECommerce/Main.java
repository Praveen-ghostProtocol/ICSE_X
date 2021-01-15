package ECommerce;

import java.util.Scanner;

/**
 * ECommerce Website
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("***************************************************************");
        System.out.println("             Welcome to the AmaKartBay Application             ");
        System.out.println("***************************************************************");
        System.out.println();
        boolean flag = true;
        int runtime  = 1;
        Product[] selectedProducts =  new Product[100];
        do
        {
            System.out.println("Select the type"); 
            //Main Type Display
            Type[] types = Main.SetUpData();
            for(int i=0;i<types.length;i++)
            {
                System.out.println(types[i].GetNumber() + ". " + types[i].GetName());
            }

            int TypeChoice = ob.nextInt();
            Type selectedType = types[TypeChoice-1];
            System.out.println();
            System.out.println("You selected:" + selectedType.GetNumber() + ". " + selectedType.GetName());

            Type[] subTypes = selectedType.GetSubTypes();
            //Sub Type Display
            System.out.println();
            System.out.println("Select the sub-type");
            for(int i=0;i<subTypes.length;i++)
            {
                System.out.println(subTypes[i].GetNumber() + ". " + subTypes[i].GetName());
            }

            int SubTypeChoice = ob.nextInt();
            Type selectedSubType = subTypes[SubTypeChoice-1];
            System.out.println();
            System.out.println("You selected:" + selectedSubType.GetNumber() + ". " + selectedSubType.GetName());

            Product[] products = selectedSubType.GetProducts();
            //Product Display
            System.out.println();
            System.out.println("Select the product");
            for(int i=0;i<products.length;i++)
            {
                System.out.println(products[i].GetNumber() + ". " + products[i].GetName() + "; Price: " + products[i].GetPrice());
            }

            int ProductChoice = ob.nextInt();
            Product selectedProduct = products[ProductChoice-1];
            System.out.println();
            System.out.println("You selected:" + selectedProduct.GetNumber() + ". " + selectedProduct.GetName());
            System.out.println("Enter Quantity");
            int ProductQuantity = ob.nextInt();
            
            selectedProduct.SetQuantity(ProductQuantity);
            System.out.println("You selected Quantity: " + ProductQuantity);
            System.out.println();

            
            selectedProducts[runtime-1] = selectedProduct;

            ShoppingCart cart = new ShoppingCart(1,0,100);
            cart.SetProducts(selectedProducts);
            double totalPrice= 0.0;

            System.out.println("Selected Products");
            for(int i=0;i<selectedProducts.length;i++)
            {
                if (selectedProducts[i]==null)
                {
                    break;
                }
                System.out.println(selectedProducts[i].GetNumber() + ". " + selectedProducts[i].GetName());
                
                totalPrice += selectedProducts[i].GetQuantity()*selectedProducts[i].GetPrice();
            }            
            cart.SetTotalPrice(totalPrice);


            System.out.println("total Price : "+ totalPrice);
            System.out.println("Do you want to go more shopping? (y/n)");
            char ContinueChoice = ob.next().charAt(0);
            ContinueChoice = Character.toUpperCase(ContinueChoice);
            if(ContinueChoice == 'N')
            {
                flag = false;
            }
            else if(ContinueChoice == 'Y')
            {
                flag = true;
                runtime++;
            }
            else
            {
                System.out.println("Wrong Choice!!");
                break;                
            }

        }while(flag == true);
        ob.close();
    }

    public static Type[] SetUpData()
    {
        //Product 1
        Product Bread = new Product(2101, "Milk Bread", 40.00, 1000);
        Product Cake = new Product(2102, "Cake", 100.00, 1000);

        //Subtype 1
        Type BakerysubType = new Type(1, "Bakery", 0, 2);
        BakerysubType.addProduct(1, Bread);
        BakerysubType.addProduct(2, Cake);

        //Product 1
        Product Avocado = new Product(2201, "Avocados", 50.00, 100);
        Product DragonFruit = new Product(2202, "Dragon Fruit", 500.00, 1000);

        //Subtype 2
        Type FruitsubType = new Type(2, "Fruits", 0, 2);
        FruitsubType.addProduct(1, Avocado);
        FruitsubType.addProduct(2, DragonFruit);

        //Type 2(Above)
        Type Groceriestype = new Type(2, "Groceries", 2, 0);
        Groceriestype.addSubType(1, BakerysubType);
        Groceriestype.addSubType(2, FruitsubType);

        //Product 1
        Product tv = new Product(1101, "TV", 100000.00, 100);
        Product dvd = new Product(1102, "DVD Player", 1000.00, 10);

        //Subtype 1
        Type homeEntertainmentsubType = new Type(1, "Home Entertainment", 0, 2);
        homeEntertainmentsubType.addProduct(1, tv);
        homeEntertainmentsubType.addProduct(2, dvd);

        Product Iphone12 = new Product(1201, "Iphone 12", 100000.00, 100);
        Product OneplusX = new Product(1202, "One Plus X", 50000.00, 100);

        //Subtype 2
        Type MobilesubType = new Type(2, "Mobiles", 0, 2);
        MobilesubType.addProduct(1, Iphone12);
        MobilesubType.addProduct(2, OneplusX);

        //Type 1(Above)
        Type Electronicstype = new Type(1, "Electronics", 2, 0);
        Electronicstype.addSubType(1, homeEntertainmentsubType);
        Electronicstype.addSubType(2, MobilesubType);

        //Product 1
        Product GoldBangle = new Product(3101, "Gold Bangle", 100000.00, 100);
        Product DiamondBangle = new Product(3102, "Diamond Bangle", 1000000.00, 10);

        //Subtype 1
        Type BanglessubType = new Type(1, "Bangles ", 0, 2);
        BanglessubType.addProduct(1, GoldBangle);
        BanglessubType.addProduct(2, DiamondBangle);

        Product GoldNecklace = new Product(3201, "Gold Necklace", 100000.00, 100);
        Product DiamondNecklace = new Product(3202, "Diamond Necklace", 5000000.00, 100);

        //Subtype 2
        Type NeckalcesubType = new Type(2, "Necklaces", 0, 2);
        NeckalcesubType.addProduct(1, GoldNecklace);
        NeckalcesubType.addProduct(2, DiamondNecklace);

        //Type 3(Above)
        Type Jewellerytype = new Type(3, "Jewellery", 2, 0);
        Jewellerytype.addSubType(1, BanglessubType);
        Jewellerytype.addSubType(2, NeckalcesubType);

        //Product 1
        Product AudiA3 = new Product(4101, "Audi A3", 4000000.00, 100);
        Product BMWX7 = new Product(4202, "BMW X7", 5000000.00, 10);

        //Subtype 1
        Type SedansubType = new Type(1, "Sedans ", 0, 2);
        SedansubType.addProduct(1, AudiA3);
        SedansubType.addProduct(2, BMWX7);

        Product JaguarX30 = new Product(4201, "Jaguar X30", 100000.00, 100);
        Product BenzS230 = new Product(4202, "Benz S230", 50000.00, 100);

        //Subtype 2
        Type SUVsubType = new Type(2, "SUVs", 0, 2);
        SUVsubType.addProduct(1, JaguarX30);
        SUVsubType.addProduct(2, BenzS230);

        //Type 4(Above)
        Type Carstype = new Type(4, "Cars", 2, 0);
        Carstype.addSubType(1, SedansubType);
        Carstype.addSubType(2, SUVsubType);

        //Product 1
        Product KingBed = new Product(5101, "King Sized Bed", 10000.00, 100);
        Product Wardrobe = new Product(5102, "Wardrobe", 5000.00, 10);

        //Subtype 1
        Type HomesubType = new Type(1, "Home Furniture ", 0, 2);
        HomesubType.addProduct(1, KingBed);
        HomesubType.addProduct(2, Wardrobe);

        Product DiningTable6 = new Product(5201, "Dining Table for 6", 10000.00, 100);
        Product ServingTable6 = new Product(5202, "Serving Table for 6", 6000.00, 100);

        //Subtype 2
        Type DiningsubType = new Type(2, "Dining Furniture", 0, 2);
        DiningsubType.addProduct(1, DiningTable6);
        DiningsubType.addProduct(2, ServingTable6);

        //Type 5(Above)
        Type Furnituretype = new Type(5, "Furniture", 2, 0);
        Furnituretype.addSubType(1, HomesubType);
        Furnituretype.addSubType(2, DiningsubType);

        //Product 1
        Product Tracks = new Product(6101, "Tracks", 100.00, 1000);
        Product Jeans = new Product(6102, "jeans", 500.00, 1000);

        //Subtype 1
        Type BottomssubType = new Type(1, "Bangles ", 0, 2);
        BottomssubType.addProduct(1, Tracks);
        BottomssubType.addProduct(2, Jeans);

        Product Shirts = new Product(6201, "Shirts", 200.00, 100);
        Product Skirts = new Product(6202, "Skirts", 500.00, 100);

        //Subtype 2
        Type TopssubType = new Type(2, "Tops", 0, 2);
        TopssubType.addProduct(1, Shirts);
        TopssubType.addProduct(2, Skirts);

        //Type 6(Above)
        Type Fashiontype = new Type(6, "Fashion", 2, 0);
        Fashiontype.addSubType(1, TopssubType);
        Fashiontype.addSubType(2, BottomssubType);

        
        //Product 1
        Product Cologne = new Product(7101, "Cologne", 1000.00, 100);
        Product PradaInfusiondIris = new Product(7102, "Prada Infusion d'Iris", 5000.00, 10);

        //Subtype 1
        Type ItaliansubType = new Type(1, "Italian subType ", 0, 2);
        ItaliansubType.addProduct(1, Cologne);
        ItaliansubType.addProduct(2, PradaInfusiondIris);

        Product NinaRicci = new Product(7201, "Nina Ricci", 1000.00, 100);
        Product Givenchy = new Product(7202, "Givenchy", 5000.00, 100);

        //Subtype 2
        Type FrenchsubType = new Type(2, "French Perfumes", 0, 2);
        FrenchsubType.addProduct(1, NinaRicci);
        FrenchsubType.addProduct(2, Givenchy );

        //Type 7(Above)
        Type Fragrancestype = new Type(7, "Fragrances", 2, 0);
        Fragrancestype.addSubType(1, ItaliansubType);
        Fragrancestype.addSubType(2, FrenchsubType);

        Type[] types = new Type[7];
        types[0] = Electronicstype;
        types[1] = Groceriestype;
        types[2] = Jewellerytype;
        types[3] = Carstype;
        types[4] = Furnituretype;
        types[5] = Fashiontype;
        types[6] = Fragrancestype;
        
        return types;
    }
}
