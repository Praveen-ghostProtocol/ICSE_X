package ECommerce;


/**
 * class to store products
 */
public class Product
{
    public Product(int number, String name, double price, int quantity) 
    {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    private int number;
    public int GetNumber() { return number; }
    public void SetNumber(int number) { this.number = number; }

    private String name;
    public String GetName() { return name; }
    public void SetName(String name) { this.name = name; }

    private int quantity;//available quantity
    public int GetQuantity() { return quantity; }
    public void SetQuantity(int quantity) { this.quantity = quantity; }

    private double price;
    public double GetPrice() { return price; }
    public void SetPrice(double price) { this.price = price; }
    
}
