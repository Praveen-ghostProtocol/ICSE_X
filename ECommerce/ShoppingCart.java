package ECommerce;


/**
 *class to create a shopping cart and store all shopped stuff
 */
public class ShoppingCart
{
    public ShoppingCart(int number, double totalPrice, int numberProducts) 
    {
        
        if(numberProducts > 0)
        {
            products = new Product[numberProducts];
        }
        this.number = number;
        this.totalPrice = totalPrice;
        
    }
    
    private int number;
    public int GetNumber() { return number; }
    public void SetNumber(int number) { this.number = number; }

    private double totalPrice;
    public double GetTotalPrice() { return totalPrice; }
    public void SetTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
    
    private Product[] products;
    public Product[] GetProducts() { return products; }
    public void SetProducts(Product[] products) { this.products = products; }
    public void addProduct(int index, Product product) {products[index] = product;}

}
