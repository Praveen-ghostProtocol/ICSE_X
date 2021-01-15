package Methods;



/*Write a program in Java using a method Discount() to calculate a single discount  
or a successive discount.  
Use overloaded methods  
Discount(int)  
Discount(int,int) 
Discount(int,int,int)  
to calculate single discount and successive discount respectively.  
Calculate and display the amount to be paid by the customer after getting discounts  
on the printed price of an article. 
 
Sample Input:  
Enter the printed price   : 12000 
Enter the no. of discounts : 2 
Enter the discount rates  : 10 , 8 
Working 
=12000 – 1200 = 10800 – 864 =  9936 
Sample Output: Amount to be paid = Rs. 9936 
 */ 
  
 
import java.util.*; 
public class Discounts 
{ 
    static float price; 
    double a1;
    double a2;
    double a3; // instance variables declared here can be used across methods of this class.
  
    public void Discount(int d1) 
    { 
        a1=price -(price * d1/100.0);           //price-(price*discount%) 
        System.out.println("\n\nAmount after discount :"+ a1); 
    } 
     
     public void Discount(int d1, int d2) 
    { 
        a1=price-(price*d1/100.0);               //price-(price*discount%) 
        System.out.println("Amount after 1st discount :"+a1); 
        a2=a1-(a1*d2/100);       
        System.out.println("Amount after 2nd discount :"+a2);      
    } 
     
     public void Discount(int d1,int d2,int d3) 
    { 
        a1=price-(price*d1/100);                  //price-(price*discount%) 
        System.out.println("Amount after 1st discount :"+a1); 
        a2=a1-(a1*d2/100); 
        System.out.println("Amount after 2nd discount :"+a2); 
        a3=a2-(a2*d3/100); 
        System.out.println("Amount after 3rd discount :"+a3);     
    } 
  
    
    public static void main(String[] args) 
    { 
        Scanner ob=new Scanner(System.in); 
        Discounts  f=new  Discounts(); 
        int n;                               
        System.out.println("Enter the printed price of the article"); 
        price=ob.nextInt(); 
        System.out.println("Enter the number of discounts given"); 
        n=ob.nextInt(); 
        System.out.println("Enter the discount(s)"); 
        switch(n) 
        { case 1:  f.Discount(ob.nextInt());   
            break;        
            case 2:  f.Discount(ob.nextInt(),ob.nextInt()); 
            break;          
            case 3:  f.Discount(ob.nextInt(),ob.nextInt(),ob.nextInt()); 
            break;   
            default: System.out.println("Please enter valid values");
        } 
        ob.close();
    }
} 