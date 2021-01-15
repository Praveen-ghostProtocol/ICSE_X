package ECommerce;


/**
 class to store type
 */
public class Type
{
    public Type(int number, String name, int numberOfSubTypes, int numberOfproducts) 
    {
        if(numberOfSubTypes > 0)
        {
            subTypes = new Type[numberOfSubTypes];
        }
        
        if(numberOfproducts > 0)
        {
            products = new Product[numberOfproducts];
        }
        
        this.number = number;
        this.name = name;
    }
    
    private int number;
    public int GetNumber() { return number; }
    public void SetNumber(int number) { this.number = number; }

    private String name;
    public String GetName() { return name; }
    public void SetName(String name) { this.name = name; }
    
    private Type[] subTypes;
    public Type[] GetSubTypes() { return subTypes; }
    public void SetSubTypes(Type[] subTypes) { this.subTypes = subTypes; }
    public void addSubType(int index, Type subType) {subTypes[index-1] = subType;}
    
    private Product[] products;
    public Product[] GetProducts() { return products; }
    public void SetProducts(Product[] products) { this.products = products; }
    public void addProduct(int index, Product product) {products[index-1] = product;}
    
}
