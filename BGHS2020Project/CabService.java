import java.util.*;
public class CabService 
{
    int taxino;
    String name;
    int d;
    int bill;

    public CabService()
    {
        taxino=0;
        name="";
        d=0;
    }
    void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the rider");
        name = input.nextLine();
        System.out.println("Enter the number of the taxi");
        taxino =  input.nextInt();
        System.out.println("Enter the distance travelled");
        d = input.nextInt();
        input.close();
        
    }
    void calculate()
    {
        if(d<=1)
        {
            bill = 25*d;
        }
        else if(d>1 && d<=5)
        {
            bill = 25 + (30*(d-1));
        }
        else if(d>5 && d<=10)
        {
            bill =  25 + (30*4) +  (35*(d-5));
        }
        else if(d>10 && d<=20)
        {
            bill = 25 + (30*4) + (35*5)+ (40*(d-10));
        }
        else if(d>20)
        {
            bill = 25 + (30*4) + (35*5) + (40*10) + (45*(d-20));
        }
    }
    void display()
    {
        System.out.println("Taxino \t\t Name \t\t Distance(km) \t\t Bill Amount");
        System.out.println(taxino + "\t\t"+name+"\t\t"+d+"\t\t"+bill);
    }
    public static void main(String[] args)
    {
        CabService obj = new CabService();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
