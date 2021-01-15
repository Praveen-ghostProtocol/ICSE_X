package Methods;



/* Write a menu driven program to to accept the user's choice and find one of the  
following options. 
1.The perimeter of a rectangle 
2.The perimeter of a square 
Create Overloaded methods as shown below and invoke them from the sampleMethod() 
double periMethod(double, double) 
void periMethod(double)  
 */ 
  
import java.util.*; 
class Periclass{ 
     
    double periMethod(double L, double B) 
    { double p=2*(L+B); 
        return p; 
    } 
     
    void periMethod(double a) 
    {double p=4*a; 
        System.out.println("Perimeter of a Square="+p); 
    } 
     
    void sampleMethod() 
    {  Scanner ob=new Scanner(System.in); 
        double a,b,c; 
        System.out.println("MENU"); 
        System.out.println("1. Perimeter of a rectangle"); 
        System.out.println("2.Perimeter of a square"); 
        System.out.println("Enter your choice"); 
        switch(ob.nextInt()) 
        { 
            case 1: System.out.println("Enter the length followed by breadth"); 
            a=ob.nextDouble(); 
            b=ob.nextDouble(); 
            c=periMethod(a,b); 
            System.out.println(c); 
            break; 
                
            case 2: System.out.println("Enter the side of the square"); 
            a=ob.nextDouble(); 
            periMethod(a); 
            break; 
                
            default:System.out.println("Wrong choice"); 
        }
        ob.close();
    }
} 